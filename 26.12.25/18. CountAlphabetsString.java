public class CountAlphabetsString {
    public static void main(String[] args) {
        String s="Hello123!";
        int count=0;
        for(char c:s.toCharArray()) if(Character.isLetter(c)) count++;
        System.out.println("Alphabets count = "+count);
    }
}
