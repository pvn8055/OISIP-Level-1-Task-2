
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int maxNumber = 100;
        int randomNumber = random.nextInt(maxNumber) + 1;
        int userGuess;
        int numAttempts = 0;
        int maxAttempts = 10;
        int round = 1;
        int score = 0;

        System.out.println("Guess the Number Game\n");

        while (true) {
            System.out.println("Round " + round + "\n");

            while (true) {
                System.out.print("Enter a number between 1 and " + maxNumber + ": ");
                userGuess = input.nextInt();
                numAttempts++;

                if (userGuess == randomNumber) {
                    System.out.println("\nCongratulations! You guessed the number in " + numAttempts + " attempts.");
                    score += (maxAttempts - numAttempts) * 10;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("The number is higher.");
                } else {
                    System.out.println("The number is lower.");
                }

                if (numAttempts == maxAttempts) {
                    System.out.println("\nYou have exceeded the maximum number of attempts. The number was " + randomNumber + ".");
                    break;
                }
            }

            System.out.println("\nRound Score: " + score);
            System.out.println("Total Score: " + score);
            System.out.print("\nDo you want to play again? (y/n): ");
            String playAgain = input.next();

            if (playAgain.equalsIgnoreCase("n")) {
                break;
            }

            round++;
            numAttempts = 0;
            randomNumber = random.nextInt(maxNumber) + 1;
        }

        System.out.println("\nThank you for playing!");
    }
}
