package com.softserve.java_homework.lesson11;

import java.util.Random;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = getName(scanner, "Enter a first name: ");
        String lastName = getName(scanner, "Enter a last name: ");
        scanner.close();

        System.out.println(generateRandomGreeting(firstName, lastName));
    }

    public static String getName(Scanner scanner, String prompt) {
        String name;
        do {
            System.out.print(prompt);
            name = scanner.nextLine();
        } while (!isValidName(name));
        return name;
    }

    public static boolean isValidName(String name) {
        return name.matches("[a-zA-Z\\s-]+");

    }

    public static String generateRandomGreeting(String firstName, String lastName) {
        String[] greetings = {
                "Hello, %s %s!",
                "Welcome, %s %s. Nice to meet you!",
                "Yo %s %s, whats up bro!",
                "Greeting, %s %s. How are you?"
        };
        Random random = new Random();
        String greeting = greetings[random.nextInt(greetings.length)];
        return String.format(greeting, firstName, lastName);
    }
}
