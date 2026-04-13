package model;

public class TransferLog {
    private String logId;
    private Transfer transfer;
    private long timestamp;

    public TransferLog(String logId, Transfer transfer, long timestamp) {
        this.logId = logId;
        this.transfer = transfer;
        this.timestamp = timestamp;
    }

    public String getLogId() {
        return logId;
    }

    public Transfer getTransfer() {
        return transfer;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return String.format("Log[%s] - Sender: %s -> Receiver: %s | File: %s | Status: %s | Time: %d",
                logId, transfer.getSenderId(), transfer.getReceiverId(),
                transfer.getFileData().getFileName(), transfer.getStatus(), timestamp);
    }
}
