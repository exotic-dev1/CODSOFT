import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Random random = new Random();
   int maxAttempts = 7;
   int rangeStart = 1;
   int rangeEnd = 100;
   int roundsWon = 0;
   int roundsPlayed = 0;

   while (true) {
       int targetNumber = random.nextInt(rangeEnd - rangeStart + 1) + rangeStart;
       int attemptsLeft = maxAttempts;
       boolean hasWon = false;

       System.out.println("Welcome to the Number Guessing Game!");
       System.out.println("I have selected a number between " + rangeStart + " and " + rangeEnd + ". Can you guess it?");

       while (attemptsLeft > 0) {
       System.out.println("You have " + attemptsLeft + " attempts left. Enter your guess:");
       int userGuess = scanner.nextInt();

          if (userGuess == targetNumber) {
              System.out.println("Congratulations! You guessed the correct number.");
               hasWon = true;
               break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }

                attemptsLeft--;
            }

            if (!hasWon) {
                System.out.println("You've run out of attempts! The correct number was " + targetNumber + ".");
            }

            roundsPlayed++;
            if (hasWon) {
                roundsWon++;
            }

            System.out.println("Score: " + roundsWon + " out of " + roundsPlayed);
            System.out.println("Do you want to play another round? (yes/no)");
            scanner.nextLine();  
            String playAgain = scanner.nextLine();

            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for playing! Your final score is " + roundsWon + " out of " + roundsPlayed + ".");
                break;
            }
            }

        scanner.close();
    }
}
