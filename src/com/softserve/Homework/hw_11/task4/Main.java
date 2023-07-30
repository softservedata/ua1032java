package com.softserve.Homework.hw_11.task4;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Enter your first name: ");
            firstName = scanner.nextLine();
            if (firstName.matches("[a-zA-Z\\s-]+")) {
                validInput = true;
            } else {
                System.out.println("Invalid input. First name can only contain English letters, spaces, and hyphens.");
            }
        }
        validInput = false;
        while (!validInput) {
            System.out.println("Enter your last name: ");
            lastName = scanner.nextLine();
            if (lastName.matches("[a-zA-Z\\s-]+")) {
                validInput = true;
            } else {
                System.out.println("Invalid input. Last name can only contain English letters, spaces, and hyphens.");
            }
        }
        String[] greetings = {"Hello %s %s! Nice to meet you!", "Hi %s %s! How are you doing?", "Greetings %s %s! Hope you're having a great day!"};
        Random random = new Random();
        int index = random.nextInt(greetings.length);
        System.out.printf(greetings[index], firstName, lastName);
    }
}
