public class ReverseString {
    public static void main(String[] args) {
        String str = "HelloWorld";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }
}
