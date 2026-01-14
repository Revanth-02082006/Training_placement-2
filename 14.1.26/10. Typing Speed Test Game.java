import java.util.Scanner;

public class TypingSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = "Java programming is powerful!";
        System.out.println("Type this: " + test);
        long start = System.currentTimeMillis();
        String typed = sc.nextLine();
        long end = System.currentTimeMillis();
        int words = typed.split("\\s+").length;
        double timeSec = (end - start) / 1000.0;
        double wpm = (words / timeSec) * 60;
        System.out.println("Your WPM: " + wpm);
        System.out.println("Accuracy: " + (typed.equals(test) ? "Perfect" : "Check errors"));
    }
}
