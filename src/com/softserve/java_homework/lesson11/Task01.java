package com.softserve.java_homework.lesson11;

import java.util.List;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a sentence of 5 words: ");
        String sentence = scanner.nextLine();
        System.out.println("Sentence: " + sentence);

        List<String> words = List.of(sentence.split("\\s+"));
        String longestWord = getTheLongestWord(words);
        System.out.println("The longest word in the sentence: " + longestWord);
        System.out.println("The longest word has " + longestWord.length() + " letters");

        String reverseWord = getWordByIndexInReverseOrder(words, 1);
        System.out.println("The second word of the sentence in reverse order: " + reverseWord);
    }

    public static String getTheLongestWord(List<String> words) {
        String longestWord = words.get(0);
        for (String word : words) {
            if (longestWord.length() < word.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static String getWordByIndexInReverseOrder(List<String> words, int indexOfWord) {
        StringBuilder word = new StringBuilder(words.get(indexOfWord));
        return word.reverse().toString();
    }
}
