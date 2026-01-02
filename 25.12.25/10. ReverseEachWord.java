public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "Java is fun";
        for(String word : s.split(" ")){
            System.out.print(new StringBuilder(word).reverse().toString()+" ");
        }
    }
}
