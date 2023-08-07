package com.softserve.edu01.hw11.task1;

import java.util.Scanner;

public class Strings {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter sentence of five words");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        if (words.length != 5) {
            System.out.println("Please print sentence of five words!");
            return;
        }

        String longestWord = findLongestWord(words);
        int longestWordLength = longestWord.length();

        System.out.println("Longest word: " + longestWord);
        System.out.println("Longest word length: " + longestWordLength);

        if (words.length >= 2) {
            String secondWord = words[1];
            String reversedSecondWord = reverseString(secondWord);
            System.out.println("Second word reversed: " + reversedSecondWord);
        }

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
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

}
