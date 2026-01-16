import java.security.MessageDigest;
import java.util.*;

class Block {
    String data, hash, prevHash;
    long time;

    public Block(String data, String prevHash) throws Exception {
        this.data = data;
        this.prevHash = prevHash;
        this.time = new Date().getTime();
        this.hash = calculateHash();
    }

    public String calculateHash() throws Exception {
        String input = prevHash + Long.toString(time) + data;
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(input.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) sb.append(String.format("%02x", b));
        return sb.toString();
    }
}

public class BlockchainDemo {
    public static void main(String[] args) throws Exception {
        List<Block> chain = new ArrayList<>();
        chain.add(new Block("Genesis Block", "0"));
        chain.add(new Block("Second Block", chain.get(0).hash));
        chain.add(new Block("Third Block", chain.get(1).hash));

        for (Block b : chain) {
            System.out.println("Data: " + b.data);
            System.out.println("Hash: " + b.hash);
            System.out.println("Prev: " + b.prevHash);
            System.out.println();
        }
    }
}
