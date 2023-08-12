package com.softserve.edu01.hw12.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Method {
    public static int readNumber(int start, int end) throws InvalidNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between " + start + " and " + end + ": ");

        try {
            int number = scanner.nextInt();
            if (number < start || number > end) {
                throw new InvalidNumberException("Number is not in the specified range.");
            }
            return number;
        } catch (InputMismatchException e) {
            throw new InvalidNumberException("Invalid input. Please enter a valid number.");
        }
    }
}
