

public class NumberGuess {
    public static void main (String[] args) {
        NumberGame numberGame = new NumberGame();
        Prompter prompter = new Prompter(numberGame);

        // for testing purposes.
        System.out.print(numberGame.getRandomNumber());

        prompter.play();
    }
}
