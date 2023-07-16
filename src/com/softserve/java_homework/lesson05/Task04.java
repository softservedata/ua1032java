package com.softserve.java_homework.lesson05;

import java.util.Random;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        guessNumber(scanner, random);
        scanner.close();
    }

    public static void guessNumber(Scanner scanner, Random random) {
        int randomNumber = random.nextInt(11);
        System.out.println("Guess the number in range of '0' - '10'");
        while (true) {
            int myNumber = getValidNumber(scanner, "Enter: ");
            if (randomNumber > myNumber) {
                System.out.println("Too low, try again.");
            } else if (randomNumber < myNumber) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulations! You guessed number: " + myNumber);
                break;
            }
        }
    }

    public static int getValidNumber(Scanner scanner, String prompt) {
        boolean isValid;
        int number;
        System.out.print(prompt);
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Error. Please enter an integer number");
                System.out.print(prompt);
                scanner.next();
            }
            number = scanner.nextInt();
            isValid = isInRange(number);
            if (!isValid) {
                System.out.println("Error. Number is out of range. Must be: '0' - '10'");
                System.out.print(prompt);
            }
        } while (!isValid);
        return number;
    }

    public static boolean isInRange(int number) {
        return number >= 0 && number <= 10;
    }
}