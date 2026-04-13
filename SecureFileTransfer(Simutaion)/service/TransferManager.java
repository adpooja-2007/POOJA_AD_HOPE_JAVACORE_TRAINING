package service;

import exception.AuthenticationException;
import exception.FileAccessException;
import exception.TransferException;
import model.FileData;
import model.Transfer;
import model.TransferLog;
import repository.FileRepository;
import repository.TransferRepository;
import repository.UserRepository;
import security.EncryptionService;
import util.IdGenerator;
import util.LoggerUtil;

public class TransferManager {
    private AuthService authService;
    private UserRepository userRepository;
    private FileRepository fileRepository;
    private TransferRepository transferRepository;
    private EncryptionService encryptionService;

    public TransferManager(AuthService authService, UserRepository userRepository, FileRepository fileRepository, 
                           TransferRepository transferRepository, EncryptionService encryptionService) {
        this.authService = authService;
        this.userRepository = userRepository;
        this.fileRepository = fileRepository;
        this.transferRepository = transferRepository;
        this.encryptionService = encryptionService;
    }

    public Transfer sendFile(String senderId, String senderPassword, String receiverId, String fileId) throws TransferException {
        try {
            // 1. Authenticate Sender
            authService.authenticate(senderId, senderPassword);

            // 2. Validate receiver
            if (userRepository.findByUserId(receiverId) == null) {
                throw new TransferException("Receiver ID " + receiverId + " not found.");
            }

            // 3. Fetch file
            FileData originalFile = fileRepository.findById(fileId);
            if (originalFile == null) {
                throw new FileAccessException("File ID " + fileId + " not found.");
            }

            // 4. Encrypt file content
            String encryptedContent = encryptionService.encrypt(originalFile.getFileContent());
            FileData encryptedFile = new FileData(originalFile.getFileId(), originalFile.getFileName(), encryptedContent);

            // 5. Create transfer object
            Transfer transfer = new Transfer(IdGenerator.generateId(), senderId, receiverId, encryptedFile, "SUCCESS");
            
            // 6. Store transfer and log
            transferRepository.saveTransfer(transfer);
            TransferLog log = new TransferLog(IdGenerator.generateId(), transfer, System.currentTimeMillis());
            transferRepository.saveLog(log);

            LoggerUtil.info("File transferred securely from " + senderId + " to " + receiverId);
            return transfer;

        } catch (AuthenticationException | FileAccessException e) {
            LoggerUtil.error("Transfer failed: " + e.getMessage());
            throw new TransferException("Transfer failed due to: " + e.getMessage());
        }
    }

    public FileData receiveFile(String receiverId, String receiverPassword, String transferId) throws TransferException {
        try {
            // 1. Authenticate receiver
            authService.authenticate(receiverId, receiverPassword);

            // 2. Fetch transfer
            Transfer transfer = transferRepository.findByTransferId(transferId);
            if (transfer == null) {
                throw new TransferException("Transfer ID " + transferId + " not found.");
            }

            // 3. Validate receiver
            if (!transfer.getReceiverId().equals(receiverId)) {
                throw new FileAccessException("User " + receiverId + " is not authorized to receive this file.");
            }

            // 4. Decrypt file
            String decryptedContent = encryptionService.decrypt(transfer.getFileData().getFileContent());
            FileData decryptedFile = new FileData(transfer.getFileData().getFileId(), transfer.getFileData().getFileName(), decryptedContent);

            LoggerUtil.info("File successfully received and decrypted by " + receiverId);
            return decryptedFile;

        } catch (AuthenticationException | FileAccessException e) {
            LoggerUtil.error("Receive failed: " + e.getMessage());
            throw new TransferException("Receive failed due to: " + e.getMessage());
        }
    }
}
