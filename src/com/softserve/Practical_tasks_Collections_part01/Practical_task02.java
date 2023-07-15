package com.softserve.Practical_tasks_Collections_part01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practical_task02 {
    public static void main(String[] args) {
        // Read input string from the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a set of numbers: ");
        String input = scanner.nextLine();
        scanner.close();

        // Split the input string into individual numbers
        String[] numbers = input.split(", ");

        // Create a HashSet to store unique numbers
        Set<String> uniqueNumbers = new HashSet<>();

        // Iterate through each number and add it to the HashSet
        for (String number : numbers) {
            uniqueNumbers.add(number);
        }

        // Convert the HashSet back to a string with commas
        StringBuilder resultBuilder = new StringBuilder();
        for (String number : uniqueNumbers) {
            resultBuilder.append(number).append(", ");
        }

        // Remove the trailing comma and space
        String result = resultBuilder.toString().replaceAll(", $", "");

        // Output the result to the console
        System.out.println("Result: " + result);
    }
}