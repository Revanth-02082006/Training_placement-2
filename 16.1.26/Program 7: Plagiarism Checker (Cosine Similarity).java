import java.util.*;

public class PlagiarismChecker {
    private static Map<String, Integer> wordFreq(String text) {
        Map<String, Integer> freq = new HashMap<>();
        for (String word : text.toLowerCase().split("\\W+")) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        return freq;
    }

    private static double cosineSimilarity(Map<String, Integer> a, Map<String, Integer> b) {
        Set<String> words = new HashSet<>(a.keySet());
        words.addAll(b.keySet());
        int dot = 0, magA = 0, magB = 0;
        for (String w : words) {
            int x = a.getOrDefault(w, 0);
            int y = b.getOrDefault(w, 0);
            dot += x * y;
            magA += x * x;
            magB += y * y;
        }
        return dot / (Math.sqrt(magA) * Math.sqrt(magB));
    }

    public static void main(String[] args) {
        String text1 = "Java is a powerful programming language.";
        String text2 = "Programming in Java is powerful and versatile.";
        System.out.println("Similarity: " + cosineSimilarity(wordFreq(text1), wordFreq(text2)));
    }
}
