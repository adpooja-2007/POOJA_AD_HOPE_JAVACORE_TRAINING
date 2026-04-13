package security;

import java.util.Base64;

public class Base64Encryption implements EncryptionService {
    @Override
    public String encrypt(String data) {
        if (data == null) return null;
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    @Override
    public String decrypt(String data) {
        if (data == null) return null;
        byte[] decodedBytes = Base64.getDecoder().decode(data);
        return new String(decodedBytes);
    }
}
