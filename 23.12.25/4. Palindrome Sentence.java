public class PalindromeSentence {
    public static void main(String[] args) {
        String str = "Never odd or even";
        str = str.replaceAll("\\s","").toLowerCase();
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(rev.equals(str) ? "Palindrome" : "Not Palindrome");
    }
}
