import java.util.*;

class Node implements Comparable<Node> {
    char ch; int freq; Node left, right;
    Node(char c, int f) { ch = c; freq = f; }
    public int compareTo(Node o) { return freq - o.freq; }
}

public class Huffman {
    static Map<Character, String> codes = new HashMap<>();

    static void buildCodes(Node root, String s) {
        if (root.left == null && root.right == null) codes.put(root.ch, s);
        else {
            buildCodes(root.left, s+"0");
            buildCodes(root.right, s+"1");
        }
    }

    public static void main(String[] args) {
        String text = "HELLO JAVA";
        Map<Character,Integer> freq = new HashMap<>();
        for (char c : text.toCharArray()) freq.put(c, freq.getOrDefault(c,0)+1);

        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (var e : freq.entrySet()) pq.add(new Node(e.getKey(), e.getValue()));
        while (pq.size() > 1) {
            Node a = pq.poll(), b = pq.poll();
            Node parent = new Node('-', a.freq+b.freq);
            parent.left = a; parent.right = b;
            pq.add(parent);
        }
        Node root = pq.poll();
        buildCodes(root, "");
        StringBuilder encoded = new StringBuilder();
        for (char c : text.toCharArray()) encoded.append(codes.get(c));
        System.out.println("Encoded: " + encoded);
    }
}
