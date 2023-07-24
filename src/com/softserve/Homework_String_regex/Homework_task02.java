package com.softserve.Homework_String_regex;
import java.util.Scanner;
public class Homework_task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sentence with words separated by more than one space
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Replace consecutive spaces with a single space
        String result = sentence.replaceAll("\\s+", " ");

        // Display the modified sentence
        System.out.println("Modified sentence: " + result);

        scanner.close();
    }
}