public class ReverseSentenceWords {
    public static void main(String[] args) {
        String s = "Java makes coding fun";
        for(String word : s.split(" ")){
            System.out.print(new StringBuilder(word).reverse().toString()+" ");
        }
    }
}
