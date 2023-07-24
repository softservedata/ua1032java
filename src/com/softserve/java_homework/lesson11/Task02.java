package com.softserve.java_homework.lesson11;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence that contains words separated by more than one space: ");
        String sentence = scanner.nextLine();
        System.out.println("Sentence: " + sentence);

        String newSentence = sentence.replaceAll("\\s+", " ");
        System.out.println("After replace all consecutive spaces with a single space:");
        System.out.println(newSentence);
    }
}
