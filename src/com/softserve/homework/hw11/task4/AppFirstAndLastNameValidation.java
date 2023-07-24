package com.softserve.homework.hw11.task4;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AppFirstAndLastNameValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] greetings = {
                "Hello, %s!",
                "Greetings, %s!",
                "Welcome, %s!"
        };

        String namePattern = "[A-Za-z -]+$";

        String firstName;
        do {
            System.out.println("Input first name");
            firstName = sc.nextLine();
        }while (!firstName.matches(namePattern));

        String lastName;
        do {
            System.out.println("Input last name");
            lastName = sc.nextLine();
        }while (!lastName.matches(namePattern));

        String randomGreeting = greetings[random.nextInt(greetings.length)];
        String fullName = firstName + " " + lastName;

        System.out.printf(randomGreeting, fullName);

        sc.close();
    }
}
