import java.util.*;

public class QRGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        StringBuilder bits = new StringBuilder();
        for (char c : text.toCharArray()) {
            bits.append(String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0'));
        }
        System.out.println("Binary QR-like encoding: " + bits);
    }
}
