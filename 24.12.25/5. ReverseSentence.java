public class ReverseSentence {
    public static void main(String[] args) {
        String s="Java is powerful";
        String[] words=s.split(" ");
        for(int i=words.length-1;i>=0;i--) System.out.print(words[i]+" ");
    }
}
