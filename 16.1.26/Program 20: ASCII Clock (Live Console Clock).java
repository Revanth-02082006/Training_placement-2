import java.time.LocalTime;

public class ASCIIClock {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            LocalTime now = LocalTime.now();
            System.out.print("\rCurrent Time: " + now);
            Thread.sleep(1000);
        }
    }
}
