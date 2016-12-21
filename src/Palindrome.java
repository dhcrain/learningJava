import java.io.Console;

public class Palindrome {

    public static void main(String[] args) {
        Console console = System.console();
        String word = console.readLine("Enter a word: ");
        String lettersOnly = word.replaceAll("[\\W\\s]","");
        String reverseLetters = new StringBuilder(lettersOnly).reverse().toString();
        boolean palindrome = lettersOnly.equalsIgnoreCase(reverseLetters);
        if (palindrome) {
            console.printf("%s is a Palindrome\n", word);
        } else {
            console.printf("%s is NOT a Palindrome\n", word);
        }
    }
}