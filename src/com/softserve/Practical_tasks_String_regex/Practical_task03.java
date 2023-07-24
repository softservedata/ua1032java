package com.softserve.Practical_tasks_String_regex;
import java.util.Scanner;

public class Practical_task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter username " + i + ": ");
            String username = scanner.nextLine();

            // Validate the username using a regular expression
            boolean isValid = isValidUsername(username);

            // Display the result
            String message = isValid ? "Valid username" : "Invalid username";
            System.out.println(message);
        }

        scanner.close();
    }

    public static boolean isValidUsername(String username) {
        // Regular expression to check if the username is valid
        String regex = "^[A-Za-z0-9_]{3,15}$";
        return username.matches(regex);
    }
}