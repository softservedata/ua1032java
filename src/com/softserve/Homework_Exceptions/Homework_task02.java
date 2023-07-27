package com.softserve.Homework_Exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Homework_task02 {
    public static int readNumber(int start, int end) throws IllegalArgumentException, InputMismatchException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer number between " + start + " and " + end + ": ");
            int number = scanner.nextInt();

            if (number < start || number > end) {
                throw new IllegalArgumentException("Number is not in the range [" + start + "..." + end + "]");
            }

            return number;
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Invalid input. Please enter a valid integer number.");
        } finally {
            scanner.nextLine(); // Consume the newline character left in the buffer after calling nextInt()
        }
    }

    public static void main(String[] args) {
        int a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
5
        try {
            a1 = readNumber(1, 99);
            a2 = readNumber(a1 + 1, 99);
            a3 = readNumber(a2 + 1, 99);
            a4 = readNumber(a3 + 1, 99);
            a5 = readNumber(a4 + 1, 99);
            a6 = readNumber(a5 + 1, 99);
            a7 = readNumber(a6 + 1, 99);
            a8 = readNumber(a7 + 1, 99);
            a9 = readNumber(a8 + 1, 99);
            a10 = readNumber(a9 + 1, 99);

            System.out.println("Entered numbers: " + a1 + ", " + a2 + ", " + a3 + ", " + a4 + ", " + a5
                    + ", " + a6 + ", " + a7 + ", " + a8 + ", " + a9 + ", " + a10);
        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}