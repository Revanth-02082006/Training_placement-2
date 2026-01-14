import java.io.*;
import java.net.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

public class ChatServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);

        String key = "1234567890123456"; // 16-byte AES key
        SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");

        String msg;
        while ((msg = br.readLine()) != null) {
            cipher.init(Cipher.ENCRYPT_MODE, skey);
            byte[] encrypted = cipher.doFinal(msg.getBytes());
            pw.println(new String(encrypted));
        }
    }
}
