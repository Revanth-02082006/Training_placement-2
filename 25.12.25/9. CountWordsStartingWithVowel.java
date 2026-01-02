public class CountWordsStartingWithVowel {
    public static void main(String[] args) {
        String s = "Apple Orange Banana Elephant";
        int count = 0;
        for(String word : s.split(" ")){
            if(word.matches("^[AEIOUaeiou].*")) count++;
        }
        System.out.println("Words starting with vowel = " + count);
    }
}
