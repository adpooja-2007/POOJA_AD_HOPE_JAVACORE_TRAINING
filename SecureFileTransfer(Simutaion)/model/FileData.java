package model;

public class FileData {
    private String fileId;
    private String fileName;
    private String fileContent;

    public FileData(String fileId, String fileName, String fileContent) {
        this.fileId = fileId;
        this.fileName = fileName;
        this.fileContent = fileContent;
    }

    public String getFileId() {
        return fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }
}
