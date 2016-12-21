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
                } else if (mGame.getRemainingGuesses() == 0) {
                    System.out.printf("Sorry you lost, the number was %d\n", mGame.getRandomNumber());
                }
            }
        }

        private boolean promptForGuess() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("What is your guess?  ");
            String guessStr = scanner.next();
            if (mGame.inGuessListCheck(guessStr)) {
                System.out.println("You already guessed that number, guess again");
            } else {
                mGame.addToGuessList(guessStr);
                return mGame.checkGuess(guessStr);
            }
            return false;
        }

        private void displayProgress() {
            System.out.printf("\nYou have %d tries left to guess the number. \n", mGame.getRemainingGuesses());
        }
}
