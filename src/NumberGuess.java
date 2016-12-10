
/**
 * Created by daviscrain on 12/6/16.
 */


public class NumberGuess {
    public static void main (String[] args) {
        NumberGame numberGame = new NumberGame();
        // System.out.print(numberGame.getRandomNumber);
        Prompter prompter = new Prompter(numberGame);
        prompter.play();
    }
}
