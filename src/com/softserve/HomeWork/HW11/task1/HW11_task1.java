package com.softserve.HomeWork.HW11.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW11_task1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String sentence = scanner.nextLine();
        List<String> words = new ArrayList<>(List.of(sentence.split(" ")));
        System.out.println(words);
        String longestString = longestELement(words);
        System.out.println("The logest string in sentence:" + longestString + "; size: " + longestString.length());

        String reverse = reverseString(words.get(2));
        System.out.println("Reverse String: " + reverse);
    }

    public static String reverseString(String str) {
        StringBuilder reverse = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }

    public static String longestELement(List<String> words) {
        String longestString = words.get(0);
        for (String element : words) {
            if (longestString.length() < element.length()) {
                longestString = element;
            }
        }
        return longestString;
    }
}
