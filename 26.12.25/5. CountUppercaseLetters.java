public class CountUppercaseLetters {
    public static void main(String[] args) {
        String s = "HelloWorldJAVA";
        int count = 0;
        for(char c : s.toCharArray()) if(Character.isUpperCase(c)) count++;
        System.out.println("Uppercase letters = " + count);
    }
}
