public class PalindromeCheckString {
    public static void main(String[] args) {
        String str="level";
        String rev=new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(rev)?"Palindrome":"Not Palindrome");
    }
}
