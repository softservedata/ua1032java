package com.softserve.Homework.hw_11.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence of five words: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord =  word;
            }
        }
        System.out.println("The longest word is: " + longestWord);
        System.out.println("The number of letters in the longest word is: " + longestWord.length());
        StringBuilder secondWord = new StringBuilder(words[1]);
        System.out.println("The second word in reverse order is: " + secondWord.reverse().toString());
    }
}
