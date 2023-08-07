package com.softserve.homework.homework11.task1;

import java.util.Scanner;

public class Homework11_01 {
    // TODO: The task involves inputting a sentence of five words through the console. The following actions must be performed:
    //      - Identify the longest word in the sentence and display it on the console.
    //      - Determine the number of letters in the longest word.
    //      - Display the second word of the sentence in reverse order on the console.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder[] words = new StringBuilder[5];
        StringBuilder longestWord = new StringBuilder();
        String input;

        System.out.println("Enter a sentence of five words:");
        input = sc.nextLine();

        for(int i = 0; i < input.split(" ").length; i++){
            words[i] = new StringBuilder(input.split(" ")[i]);
        }

        for(StringBuilder word: words) {
            if(longestWord.length() < word.length()) {
                longestWord = word;
            }
        }

        System.out.println("The longest word in the sentence is \"" + longestWord + "\"");
        System.out.println("The number of letters in the longest word is " + longestWord.length());
        System.out.print("The second word in reverse order is \"" + words[1].reverse() + "\"");

        sc.close();
    }
}
