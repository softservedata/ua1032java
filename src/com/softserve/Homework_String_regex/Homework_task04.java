package com.softserve.Homework_String_regex;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Homework_task04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = getUserInput(scanner, "Enter your first name: ");
        String lastName = getUserInput(scanner, "Enter your last name: ");

        String fullName = firstName + " " + lastName;

        // Array of greeting phrases with placeholders for the user's name
        String[] greetingPhrases = {
                "Hello, %s! Nice to meet you.",
                "Hi, %s! How are you doing?",
                "Greetings, %s! Welcome!",
                "Hey there, %s! Have a great day!"
        };

        Random random = new Random();
        int randomIndex = random.nextInt(greetingPhrases.length);
        String greetingMessage = String.format(greetingPhrases[randomIndex], fullName);

        System.out.println(greetingMessage);

        scanner.close();
    }

    private static String getUserInput(Scanner scanner, String prompt) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine();
            if (isValidName(input)) {
                return input.trim();
            } else {
                System.out.println("Invalid input. Please use only English letters, spaces, and hyphens.");
            }
        }
    }

    private static boolean isValidName(String name) {
        // Regular expression to validate the name (English letters, spaces, and hyphens allowed)
        String regex = "^[a-zA-Z\\s-]+$";
        return Pattern.matches(regex, name);
    }
}