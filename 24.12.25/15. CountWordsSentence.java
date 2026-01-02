public class CountWordsSentence {
    public static void main(String[] args){
        String s="Java is a versatile language";
        String[] words=s.trim().split("\\s+");
        System.out.println("Words = "+words.length);
    }
}
