package com.softserve.homework.hw11.task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input sentence: ");
        String sentence = sc.nextLine();

        // Replace all consecutive spaces with a single space using regular expression
        sentence = sentence.replaceAll("\\s+", " ");

        System.out.println("Sentence: " + sentence);

        sc.close();
    }
}
