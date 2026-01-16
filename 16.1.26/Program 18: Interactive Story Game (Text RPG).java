import java.util.Scanner;

public class TextRPG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int health = 100;
        System.out.println("You wake up in a dark forest...");
        while (health > 0) {
            System.out.println("Choose: (1) Explore (2) Rest (3) Fight Monster");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("You found berries. +10 health");
                health += 10;
            } else if (choice == 2) {
                System.out.println("You rested. +5 health");
                health += 5;
            } else if (choice == 3) {
                System.out.println("Monster attacked! -20 health");
                health -= 20;
            }
            System.out.println("Health: " + health);
            if (health <= 0) System.out.println("Game Over!");
        }
    }
}
