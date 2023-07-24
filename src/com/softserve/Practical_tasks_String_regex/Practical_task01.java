package com.softserve.Practical_tasks_String_regex;
import java.util.Scanner;

public class Practical_task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two string variables
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if the first string is a substring of the second string
        boolean isSubstring = str2.contains(str1);

        // Display the result
        System.out.println("Result: " + isSubstring);

        scanner.close();
    }
}