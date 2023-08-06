package HomeWork.HomeWorkModul_11.hw11_P_2;

import java.util.Scanner;

/**
 * 2. Іnput a sentence that contains words separated by more than one space on the console. The
 * goal is to replace all consecutive spaces with a single space. For instance, if you entered the
 * sentence "I am learning Java Fundamental", the expected result should be "I am learning
 * Java Fundamental ".
 */

public class AppString2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence with words separated by more than one space
        System.out.print("Enter a sentence with words separated by more than one space: ");
        String sentence = new String(scanner.nextLine());//new String() - redundant

        // Close the Scanner object
        scanner.close();

        // Split the sentence using a regular expression to handle multiple spaces
        //The goal is to replace multiple spaces, and you're already achieving that with replaceAll.
        // So, the following code segment is unnecessary
        String[] words = sentence.split("\\s+");

        // Display the original sentence
        System.out.println("You entered the following sentence:");
        System.out.println(sentence);

        // Replace all consecutive spaces with a single space
        String sentenceWithSingleSpace = sentence.replaceAll("\\s+", " ");

        // Display the sentence with a single space between words
        System.out.println("Sentence with a single space between words:");
        System.out.println(sentenceWithSingleSpace);
    }
}


