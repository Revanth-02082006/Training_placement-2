public class CountDigitsInString {
    public static void main(String[] args) {
        String s = "Hello2026";
        int count = 0;
        for(char c : s.toCharArray()) if(Character.isDigit(c)) count++;
        System.out.println("Digits in string = " + count);
    }
}
