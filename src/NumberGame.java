import java.util.Random;

/**
 * Created by daviscrain on 12/7/16.
 */

public class NumberGame {
    // set-up
    public static final int MAX_GUESSES = 5;
    public static final int MAX = 100;
    public static final int MIN = 1;
    private int mGuesses;
    public int mRandomNumber;

    public NumberGame() {
        Random random = new Random();
        mRandomNumber = random.nextInt((MAX - MIN) + 1) + MIN;
//        mGuesses = "";
    }

    public int getRemainingGuesses() {
        return MAX_GUESSES - mGuesses;
    }

    public int getmRandomNumber() {
        return mRandomNumber;
    }

    public boolean checkGuess(String guessStr) {
        boolean isHit = false;
        try {
            isHit = Integer.parseInt(guessStr) == mRandomNumber;
            mGuesses++;
        } catch (NumberFormatException nfe) {
            System.out.print("That is not a number guess again!  \n");
        }
        return isHit;
    }
}
