import java.util.*;

public class PlagiarismChecker {
    static Map<String,Integer> wordFreq(String text) {
        Map<String,Integer> freq = new HashMap<>();
        for (String w : text.toLowerCase().split("\\W+"))
            freq.put(w, freq.getOrDefault(w,0)+1);
        return freq;
    }

    static double cosine(Map<String,Integer> a, Map<String,Integer> b) {
        Set<String> words = new HashSet<>(a.keySet());
        words.addAll(b.keySet());
        int dot=0, magA=0, magB=0;
        for (String w : words) {
            int x=a.getOrDefault(w,0), y=b.getOrDefault(w,0);
            dot+=x*y; magA+=x*x; magB+=y*y;
        }
        return dot / (Math.sqrt(magA)*Math.sqrt(magB));
    }

    public static void main(String[] args) {
        String doc1="Java is powerful and versatile.";
        String doc2="Java is versatile and widely used.";
        System.out.println("Similarity: " + cosine(wordFreq(doc1), wordFreq(doc2)));
    }
}
