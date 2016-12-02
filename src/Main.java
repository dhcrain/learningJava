import java.io.Console;

public class Main {

    public static void main(String[] args) {
        Console console = System.console();
        String word = console.readLine("Enter a word: ");
        String lettersOnly = word.replaceAll("[\\\\W\\s]|_","");
        String reverseLetters = new StringBuilder(lettersOnly).reverse().toString();

        if (lettersOnly.equalsIgnoreCase(reverseLetters)) {
            console.printf("%s is a Palindrome", word);
        } else {
            console.printf("%s is NOT a Palindrome", word);
        }
    }
}