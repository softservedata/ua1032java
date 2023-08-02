import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeworkTasks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        taskOne(scanner);
        taskTwo(scanner);
        taskThree(scanner);

    }

    public static void taskOne(Scanner scanner) {
    /*Task 1. The task involves inputting a sentence of five words through the console.
    • Identify the longest word in the sentence and display it on the console.
    • Determine the number of letters in the longest word.
    • Display the second word of the sentence in reverse order on the console. */

        System.out.println("~Input a sentence of five words: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s+");
        String longestWord = words[0];
        int maxLength = longestWord.length();
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                longestWord = words[i];
                maxLength = longestWord.length();
            }
        }
        System.out.println("The longest word is: " + longestWord);
        System.out.println("The number of letters in the longest word: " + maxLength);

        String secondWord = words[1];
        StringBuilder reverseSecondWord = new StringBuilder(secondWord).reverse();
        System.out.println("Second word in reverse: " + reverseSecondWord);
    }

    public static void taskTwo(Scanner scanner) {
        /* Іnput a sentence that contains words separated by more than one space on the console.
        The goal is to replace all consecutive spaces with a single space.
        For instance, if you entered the sentence "I am learning Java Fundamental", the expected result should be "I am learning Java Fundamental ". */

        System.out.print("Enter a sentence with words separated by more than one space: ");
        String sentence = scanner.nextLine();
        String newSentence = sentence.replaceAll("\\s+", " ");
        System.out.println("Sentence with replacement: " + newSentence);
    }

    public static void taskThree(Scanner scanner) {
        /* The task requires implementation of a pattern to match US currency format,
           which includes a dollar sign ($) followed by any number of digits, a dot, and two digits after the dot.
           The next step is to input a text containing several instances of US currency format via the console.
           Finally, display all the occurrences of US currency format on the console screen. */
        String stringPattern = "\\$\\d+(\\.\\d{2})";
        Pattern pattern = Pattern.compile(stringPattern);
        System.out.println("~Input the text containing US currency format:");
        String inputText = scanner.nextLine();
        Matcher matcher = pattern.matcher(inputText);
        System.out.println("US currency format cases:");
        while (matcher.find()) {
            System.out.println(matcher.group());

        }
    }
}
