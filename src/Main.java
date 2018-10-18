import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws Exception {
        byte[] encryptionKey = "MZygpewJsCpRrfOr".getBytes(StandardCharsets.UTF_8);
        byte[] plainText = "Hello world!".getBytes(StandardCharsets.UTF_8);
        AESUtil advancedEncryptionStandard = new AESUtil(
                encryptionKey);
        byte[] cipherText = advancedEncryptionStandard.encrypt(plainText);
        byte[] decryptedCipherText = advancedEncryptionStandard.decrypt(cipherText);

        System.out.println(new String(plainText));
        System.out.println(new String(cipherText));
        System.out.println(new String(decryptedCipherText));
    }
}
