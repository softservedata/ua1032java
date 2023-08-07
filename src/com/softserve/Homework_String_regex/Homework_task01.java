package com.softserve.Homework_String_regex;
import java.util.Scanner;
public class Homework_task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sentence of five words
        System.out.print("Enter a sentence of five words: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words
        String[] words = sentence.split(" ");// \\s+ буде універсальніше

        // Find the longest word
        String longestWord = findLongestWord(words);
        System.out.println("Longest word: " + longestWord);

        // Determine the number of letters in the longest word
        int longestWordLength = longestWord.length();
        System.out.println("Number of letters in the longest word: " + longestWordLength);

        // Display the second word in reverse order
        if (words.length >= 2) {
            String secondWord = words[1];
            String reversedSecondWord = reverseWord(secondWord);
            System.out.println("Second word in reverse order: " + reversedSecondWord);
        } else {
            System.out.println("The sentence must contain at least two words to display the second word in reverse order.");
        }

        scanner.close();
    }

    public static String findLongestWord(String[] words) {
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder(word);
        return reversedWord.reverse().toString();
    }
}