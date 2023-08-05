package com.softserve.practical.practical9.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practical09_02 {
    // TODO: Suppose, the user enters a set of numbers as a single string "1, 2, 3, 4, 4, 5, 6, 6, 7, 8" from the console (can be other numbers):
    //      - Remove of duplicate elements in a string.
    //      - Output the result to the console.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> numbers = new ArrayList<>();
        String str;

        System.out.print("Enter a single string of numbers: ");
        str = sc.next();
        String[] numbersInput = str.split(",");

        for(String number: numbersInput) {
            if(!numbers.contains(number)) numbers.add(number);
        }

        System.out.println("Collection of unique numbers: " + numbers);
    }
}
