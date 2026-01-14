import java.security.*;
import java.util.*;

class Block {
    String data, hash, prevHash;
    Block(String data, String prevHash) throws Exception {
        this.data = data;
        this.prevHash = prevHash;
        this.hash = calculateHash();
    }
    String calculateHash() throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest((data+prevHash).getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) sb.append(String.format("%02x", b));
        return sb.toString();
    }
}

public class Blockchain {
    public static void main(String[] args) throws Exception {
        List<Block> chain = new ArrayList<>();
        chain.add(new Block("Genesis", "0"));
        chain.add(new Block("Transaction1", chain.get(0).hash));
        chain.add(new Block("Transaction2", chain.get(1).hash));
        for (Block b : chain) System.out.println(b.data + " -> " + b.hash);
    }
}
