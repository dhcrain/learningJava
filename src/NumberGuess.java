import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * Created by daviscrain on 12/6/16.
 */


public class NumberGuess {
    public static void main (String[] args) {
        // Set-up
        int guesses = 5;
        int MAX = 100;
        int MIN = 1;
        int guess = -1;
        Random ran = new Random();
        int randomNumber = ran.nextInt((MAX - MIN) + 1) + MIN;
        System.out.printf("You have %s guesses to guess a number between %s and %s\n\n", guesses, MIN, MAX);

        // create a scanner to read cl input
        Scanner scanner = new Scanner(System.in);

        while (guess != randomNumber && guesses > 0) {
//            System.out.print(randomNumber);
            System.out.print("What is your guess?  ");
            String guessStr = scanner.next();
            try {
                guess = Integer.parseInt(guessStr);
                guesses--;

                if (guess == randomNumber) {
                    System.out.printf("You Win! the number was %s\n", randomNumber);
                } else {
                    if (guess < randomNumber) {
                        System.out.print("Too Low!  ");
                    } else {
                        System.out.print("Too high!  ");
                    }
                    if (abs(guess - randomNumber) <= 5) {
                        System.out.print("Your Getting Close!\n");
                    }
                    System.out.printf("You have %s guesses left\n", guesses);
                }
            } catch (NumberFormatException nfe) {
                System.out.print("That is not a number guess again!  \n");
            }
        }
    }

}
