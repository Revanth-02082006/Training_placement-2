public class SimpleRegex {
    public static boolean match(String text, String pattern) {
        if (pattern.isEmpty()) return text.isEmpty();
        boolean firstMatch = (!text.isEmpty() &&
                (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));
        if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
            return match(text, pattern.substring(2)) ||
                   (firstMatch && match(text.substring(1), pattern));
        } else {
            return firstMatch && match(text.substring(1), pattern.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(match("aab", "c*a*b")); // true
        System.out.println(match("miss", "mis*")); // true
    }
}
