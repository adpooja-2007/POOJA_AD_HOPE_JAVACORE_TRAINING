package model;

public class FilePolicy {
    private boolean requiresEncryption;
    private long maxSize;

    public FilePolicy(boolean requiresEncryption, long maxSize) {
        this.requiresEncryption = requiresEncryption;
        this.maxSize = maxSize;
    }

    public boolean isRequiresEncryption() {
        return requiresEncryption;
    }

    public long getMaxSize() {
        return maxSize;
    }
}
