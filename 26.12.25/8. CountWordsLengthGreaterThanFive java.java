public class CountWordsLengthGreaterThanFive {
    public static void main(String[] args) {
        String s = "Java programming is powerful and versatile";
        int count = 0;
        for(String word : s.split(" ")) if(word.length() > 5) count++;
        System.out.println("Words longer than 5 letters = " + count);
    }
}
