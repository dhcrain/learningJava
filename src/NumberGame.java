import java.util.Random;

/**
 * Created by daviscrain on 12/7/16.
 */

public class NumberGame {
    // set-up
    public static final int MAX_GUESSES = 5;
    public static final int MAX = 100;
    public static final int MIN = 1;
    private int guess = -1;
    public int randomNumber;
    private String guesses;

    public NumberGame() {
        Random random = new Random();
        randomNumber = random.nextInt((MAX - MIN) + 1) + MIN;
        guesses = "";
    }

    public int getRemainingGuesses() {
        return guess;
    }

    public boolean applyGuess(String guessStr) {
//        String guessString = mAnswer.indexOf(guess);
        boolean isHit = Integer.parseInt(guessStr) == randomNumber;
        try {
//            guesses--;
        } catch (NumberFormatException nfe) {
            System.out.print("That is not a number guess again!  \n");
        }
        return isHit;
    }
}
