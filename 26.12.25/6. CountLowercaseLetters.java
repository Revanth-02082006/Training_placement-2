public class CountLowercaseLetters {
    public static void main(String[] args) {
        String s = "HelloWorldJAVA";
        int count = 0;
        for(char c : s.toCharArray()) if(Character.isLowerCase(c)) count++;
        System.out.println("Lowercase letters = " + count);
    }
}
