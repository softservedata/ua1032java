package com.softserve.homework.hw11.task1;

import java.util.Scanner;

public class AppSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a sentence of 5 words:");

        String input;
        String[] sentence;

        // Continue to prompt the user until a valid sentence with exactly 5 words is entered
        while (true) {
            input = sc.nextLine();
            sentence = input.split(" ");

            if (sentence.length == 5) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a sentence with exactly 5 words:");
            }
        }

        //Output sentece
        System.out.println("You entered the following sentence:");
        for (String word : sentence) {
            System.out.print(word + " ");
        }

        //find the longest word in sentence
        String longestWord = Sentence.findLongestWord(sentence);
        System.out.print("\nLongest word: " +  longestWord);

        //find length of the longest word
        int lengthOfLongestWord = Sentence.findLengthOfLongestWord(sentence);
        System.out.println(" , its length = " + lengthOfLongestWord);

        //reverse second word of the sentence
        String reversedSecondWord = Sentence.reverseSecondWord(sentence);
        System.out.println("Reversed second word: " + reversedSecondWord);

        sc.close();
    }
}
