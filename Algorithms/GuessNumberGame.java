package algorithms;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secret = random.nextInt(100) + 1; // 1–100
        int attempts = 0;
        boolean guessed = false;

        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess it! Type 0 to quit.\n");

        while (!guessed) {
            System.out.print("Your guess: ");
            int guess = scanner.nextInt();

            if (guess == 0) {
                System.out.println("You gave up! The number was: " + secret);
                break;
            }

            attempts++;

            if (guess < secret) {
                System.out.println("Too low, try again.\n");
            } else if (guess > secret) {
                System.out.println("Too high, try again.\n");
            } else {
                System.out.println("Nice! You got it in " + attempts + " attempts.");
                guessed = true;
            }
        }

        scanner.close();
    }
}
