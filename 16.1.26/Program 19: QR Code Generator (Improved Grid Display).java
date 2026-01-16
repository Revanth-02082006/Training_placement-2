public class QRGrid {
    public static void main(String[] args) {
        String text = "JAVA";
        for (char c : text.toCharArray()) {
            String bin = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
            for (char b : bin.toCharArray()) {
                System.out.print(b == '1' ? "██" : "  ");
            }
            System.out.println();
        }
    }
}
