import java.util.Random;
import java.util.Scanner;

public class Q04_Number_Guessing_Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int target = random.nextInt(100) + 1;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100.");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scan.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Enter a number from 1 to 100.");
            } else if (guess < target) {
                System.out.println("Too low! Try again.");
            } else if (guess > target) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! You guessed the number.");
                System.out.println("Attempts: " + attempts);
                break;
            }
        }

        scan.close();
    }
}