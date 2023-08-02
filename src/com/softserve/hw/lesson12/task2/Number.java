package com.softserve.hw.lesson12.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {
    public static int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            try {
                number = scanner.nextInt();
                if (number < start || number > end) {
                    System.out.println("You input an invalid number. Please try again.");
                } else {
                    return number;
                }
            } catch (InputMismatchException e) {
                System.out.println("You input an invalid argument. Please try again.");
                scanner.next(); // Clear the invalid input from the scanner buffer
            }
        } while (true);
    }
}
