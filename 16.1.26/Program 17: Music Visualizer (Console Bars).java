import java.util.Random;

public class MusicVisualizer {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        for (int i = 0; i < 50; i++) {
            int level = rand.nextInt(30);
            for (int j = 0; j < level; j++) System.out.print("|");
            System.out.println();
            Thread.sleep(200);
        }
    }
}
