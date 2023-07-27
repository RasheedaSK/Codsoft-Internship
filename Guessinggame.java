import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Create a random number generator and generate a random number between 1 and 100
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Variable to store the user's guess
        int userGuess;

        // Variable to keep track of the number of attempts
        int attempts = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        // Repeat until the user guesses the correct number
        while (true) {
            // Prompt the user to enter their guess
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            // Compare the user's guess with the generated number and provide feedback
            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("Total attempts: " + attempts);
                break; // Exit the loop since the user guessed correctly
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        // Close the Scanner
        scanner.close();
    }
}
