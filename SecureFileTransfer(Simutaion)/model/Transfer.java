package model;

public class Transfer {
    private String transferId;
    private String senderId;
    private String receiverId;
    private FileData fileData;
    private String status;

    public Transfer(String transferId, String senderId, String receiverId, FileData fileData, String status) {
        this.transferId = transferId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.fileData = fileData;
        this.status = status;
    }

    public String getTransferId() {
        return transferId;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public FileData getFileData() {
        return fileData;
    }

    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}
