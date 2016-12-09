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
    private int guesses;
    public int randomNumber;
    private String guess;

    public NumberGame() {
        Random random = new Random();
        randomNumber = random.nextInt((MAX - MIN) + 1) + MIN;
        guess = "";
    }

    public int getRemainingGuesses() {
        return MAX_GUESSES - guesses;
    }

    public boolean checkGuess(String guessStr) {
        boolean isHit = false;
        try {
            isHit = Integer.parseInt(guessStr) == randomNumber;
            guesses++;
        } catch (NumberFormatException nfe) {
            System.out.print("That is not a number guess again!  \n");
        }
        return isHit;
    }
}
