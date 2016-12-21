import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.abs;

/**
 * Created by daviscrain on 12/7/16.
 */

public class NumberGame {
    // set-up
    public static final int MAX_GUESSES = 5;
    public static final int MAX = 100;
    public static final int MIN = 1;
    private int mGuesses;
    private int mRandomNumber;
    private List<String> mGuessList = new ArrayList<String>();

    public NumberGame() {
        Random random = new Random();
        mRandomNumber = random.nextInt((MAX - MIN) + 1) + MIN;
    }

    public void addToGuessList(String guess) {
        mGuessList.add(guess);
    }

    public boolean inGuessListCheck(String guess) {
        return mGuessList.contains(guess);
    }

    public int getRemainingGuesses() {
        return MAX_GUESSES - mGuesses;
    }

    public int getRandomNumber() {
        return mRandomNumber;
    }

    public List<String> getGuessList() {
        return mGuessList;
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
