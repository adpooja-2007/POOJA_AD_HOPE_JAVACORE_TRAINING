package service;

import model.FileData;
import repository.FileRepository;
import util.LoggerUtil;

public class FileService {
    private FileRepository fileRepository;

    public FileService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public void storeFile(FileData file) {
        fileRepository.save(file);
        LoggerUtil.info("File '" + file.getFileName() + "' stored in directory with ID " + file.getFileId());
    }

    public FileData getFile(String fileId) {
        return fileRepository.findById(fileId);
    }
}
