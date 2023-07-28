package com.softserve.practical.practical13.task3;

import java.util.Arrays;
import java.util.List;

public class Practical13_03 {
    // TODO: Write a method for sorting list of Strings using Java 8

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Banana", "Apple", "Milk", "Juice", "Orange");

        System.out.println("Actual list of Strings: " + words);
        words.sort(String::compareTo);

        System.out.println("Sorted list of Strings: " + words);
    }
}
