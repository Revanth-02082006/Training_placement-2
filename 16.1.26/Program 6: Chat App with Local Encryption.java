import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Scanner;

public class EncryptedChat {
    private static SecretKey key;

    static {
        try {
            key = KeyGenerator.getInstance("AES").generateKey();
        } catch (Exception e) { e.printStackTrace(); }
    }

    public static String encrypt(String msg) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        return new String(cipher.doFinal(msg.getBytes()));
    }

    public static String decrypt(String encrypted) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        return new String(cipher.doFinal(encrypted.getBytes()));
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter message: ");
        String msg = sc.nextLine();
        String enc = encrypt(msg);
        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + decrypt(enc));
    }
}
