import java.util.Scanner;

/**
 * Created by daviscrain on 12/7/16.
 */
public class Prompter {
        private NumberGame mGame;

        public Prompter (NumberGame game) {
            mGame = game;
        }

        public void play() {
            System.out.printf("You have %s guesses to guess a number between %s and %s\n\n", mGame.MAX_GUESSES, mGame.MIN, mGame.MAX);
            while (mGame.getRemainingGuesses() > 0) {
                displayProgress();
                boolean isWinner = promptForGuess();
                if (isWinner) {
                    System.out.print("You WIN!!\n");
                    break;
                }
                if (mGame.getRemainingGuesses() == 0) {
                    System.out.printf("Sorry you lost the number was %d\n", mGame.getmRandomNumber());
                }
            }
        }

        public boolean promptForGuess() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("What is your guess?  ");
            String guessStr = scanner.next();
            return mGame.checkGuess(guessStr);
        }

        public void displayProgress() {
            System.out.printf("\nYou have %d tries left to guess the number. \n", mGame.getRemainingGuesses());
        }
}
