public class PalindromeString {
    public static void main(String[] args) {
        String str="madam";
        String rev=new StringBuilder(str).reverse().toString();
        System.out.println(str+(rev.equals(str)?" is Palindrome":" is Not Palindrome"));
    }
}
