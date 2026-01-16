public class RLECompression {
    public static String compress(String input) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= input.length(); i++) {
            if (i == input.length() || input.charAt(i) != input.charAt(i-1)) {
                sb.append(input.charAt(i-1)).append(count);
                count = 1;
            } else count++;
        }
        return sb.toString();
    }

    public static String decompress(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i+=2) {
            char c = input.charAt(i);
            int count = Character.getNumericValue(input.charAt(i+1));
            for (int j = 0; j < count; j++) sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String data = "aaabbccccd";
        String compressed = compress(data);
        System.out.println("Compressed: " + compressed);
        System.out.println("Decompressed: " + decompress(compressed));
    }
}
