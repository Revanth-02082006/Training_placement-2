import java.util.HashMap;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");

        HashMap<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word frequencies:");
        for (String key : freq.keySet()) {
            System.out.println(key + " : " + freq.get(key));
        }
        sc.close();
    }
}
