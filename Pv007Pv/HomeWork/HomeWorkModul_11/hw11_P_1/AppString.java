package hw11_P_1;

import java.util.Scanner;

/**
 * 1. The task involves inputting a sentence of five words through the console. The following actions
 * must be performed:
 * • Identify the longest word in the sentence and display it on the console.
 * • Determine the number of letters in the longest word.
 * • Display the second word of the sentence in reverse order on the console.
 */

public class AppString {
    public static void main(String[] args) {
        // Create a Scanner object for reading input from the console.
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a sentence with five words.
        System.out.print("Enter a sentence with five words: ");
        String sentence = new String(scanner.nextLine());//new String() - redundant

        // Close the Scanner object.
        scanner.close();

        // Check if the sentence contains five words.
       // String[] words = sentence.trim().split("\\s+");
        // it's better to use, because it will work with any number of spaces
        String[] words = sentence.split(" ");
        if (words.length == 5) {
            System.out.println("You entered a sentence with five words: " + sentence);

            // Find the longest word.
            String longestWord = "";
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            System.out.println("The longest word in the sentence: " + longestWord);
            System.out.println("Number of letters in the longest word: " + longestWord.length());

            // Print the second word in reverse order.
            String secondWord = words[1];
            StringBuilder reversedSecondWord = new StringBuilder(secondWord).reverse();
            System.out.println("The second word in reverse order: " + reversedSecondWord.toString());

        } else {
            System.out.println("Enter a sentence with five words.");
        }
    }
}

