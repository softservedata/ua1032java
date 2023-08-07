package com.softserve.homework.homework11.task2;

import java.util.Scanner;

public class Homework11_02 {
    // TODO: Input a sentence that contains words separated by more than one space on the console.
    //      The goal is to replace all consecutive spaces with a single space.
    //      For instance, if you entered the sentence "I am learning Java Fundamental",
    //      the expected result should be "I am learning Java Fundamental ".

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("Enter a sentence: ");
        input = sc.nextLine();

        input = input.replaceAll("\\s{2,}", " ");
        System.out.println("Corrected input: " + input );

        sc.close();
    }
}
