package security;

public interface EncryptionService {
    String encrypt(String data);
    String decrypt(String data);
}
