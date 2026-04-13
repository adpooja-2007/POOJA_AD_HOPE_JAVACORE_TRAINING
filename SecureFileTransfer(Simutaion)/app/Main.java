package app;

import exception.TransferException;
import model.FileData;
import model.Transfer;
import model.TransferLog;
import model.User;
import repository.FileRepository;
import repository.TransferRepository;
import repository.UserRepository;
import security.Base64Encryption;
import security.EncryptionService;
import service.AuthService;
import service.FileService;
import service.TransferManager;
import util.IdGenerator;
import util.LoggerUtil;

public class Main {
    public static void main(String[] args) {
        LoggerUtil.info("--- Starting Secure File Transfer System Simulation ---");
        UserRepository userRepository = new UserRepository();
        FileRepository fileRepository = new FileRepository();
        TransferRepository transferRepository = new TransferRepository();
        EncryptionService encryptionService = new Base64Encryption();
        AuthService authService = new AuthService(userRepository);
        FileService fileService = new FileService(fileRepository);
        TransferManager transferManager = new TransferManager(authService, userRepository, fileRepository, transferRepository, encryptionService);
        LoggerUtil.info("\n--- 1. User setup ---");
        User alice = new User("alice123", "passwordA");
        User bob = new User("bob456", "passwordB");
        userRepository.save(alice);
        userRepository.save(bob);
        LoggerUtil.info("Users Alice and Bob registered.");

        LoggerUtil.info("\n--- 2. File setup ---");
        String fileId = IdGenerator.generateId();
        FileData secretFile = new FileData(fileId, "secret_plans.txt", "This is top secret information about the new project!");
        fileService.storeFile(secretFile);
        LoggerUtil.info("\n--- 3. Alice initiates transfer to Bob ---");
        Transfer completedTransfer = null;
        try {
            completedTransfer = transferManager.sendFile("alice123", "passwordA", "bob456", fileId);
            LoggerUtil.info("Encrypted content sent over 'network': \n  " + completedTransfer.getFileData().getFileContent());
        } catch (TransferException e) {
            LoggerUtil.error("Transfer failed: " + e.getMessage());
        }

        if (completedTransfer != null) {
            LoggerUtil.info("\n--- 4. Bob receives and decrypts the file ---");
            try {
                FileData receivedFile = transferManager.receiveFile("bob456", "passwordB", completedTransfer.getTransferId());
                LoggerUtil.info("Decrypted Original content: \n  " + receivedFile.getFileContent());
            } catch (TransferException e) {
                LoggerUtil.error("Receive failed: " + e.getMessage());
            }
        }
        LoggerUtil.info("\n--- 5. View Transfer Logs ---");
        for (TransferLog log : transferRepository.getAllLogs()) {
            LoggerUtil.info(log.toString());
        }
        LoggerUtil.info("\n--- 6. Attacker attempts to login as Bob ---");
        try {
            transferManager.receiveFile("bob456", "wrong_password", completedTransfer.getTransferId());
        } catch (TransferException e) {
            LoggerUtil.error("Expected Exception Caught: " + e.getMessage());
        }
    }
}
