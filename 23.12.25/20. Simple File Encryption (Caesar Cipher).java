public class CaesarCipher {
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char)((c - base + shift) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String message = "HelloWorld";
        int shift = 3;
        String encrypted = encrypt(message, shift);
        System.out.println("Original: " + message);
        System.out.println("Encrypted: " + encrypted);
    }
}
