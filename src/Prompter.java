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
            while (mGame.getRemainingGuesses() != mGame.randomNumber && mGame.getRemainingGuesses() > 0) {
                System.out.printf("You have %s guesses to guess a number between %s and %s\n\n", mGame.MAX_GUESSES, mGame.MIN, mGame.MAX);
                displayProgress();
                promptForGuess();
            }
        }

        public boolean promptForGuess() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("What is your guess?  ");
            String guessStr = scanner.next();
            return mGame.applyGuess(guessStr);
        }

        public void displayProgress() {
            System.out.printf("You have %d tries left to solve: \n", mGame.getRemainingGuesses());
        }
}
