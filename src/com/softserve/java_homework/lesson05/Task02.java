package com.softserve.java_homework.lesson05;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers to get the sum.");
        sumNumbers(scanner);
        scanner.close();
    }

    public static void sumNumbers(Scanner scanner) {
        boolean keepTheProgram;
        do {
            int number1 = readInt(scanner, "Number 1: ");
            int number2 = readInt(scanner, "Number 2: ");
            int sum = number1 + number2;
            System.out.println("Sum of " + number1 + " and " + number2 + " equals: " + sum);

            keepTheProgram = shouldContinue(scanner);
        } while (keepTheProgram);
    }

    public static int readInt(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Error. Please enter an integer");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static boolean shouldContinue(Scanner scanner) {
        System.out.println("Do you want to continue?");
        System.out.println("Enter 'yes'\t'no'");
        scanner.nextLine();
        while(true) {
            String keep = scanner.nextLine().toLowerCase();
            switch (keep) {
                case "yes" -> {
                    System.out.println("Let's continue!");
                    return true;
                }
                case "no" -> {
                    System.out.println("See you next time!");
                    return false;
                }
                default -> System.out.println("Unknown response. Enter 'yes' or 'no'");
            }
        }
    }
}