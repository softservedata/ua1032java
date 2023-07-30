package com.softserve.Homework.hw_12.task2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = readNumber(start, end);
            start = numbers[i];
        }
    }

    public static int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter a number in the range [" + start + "..." + end + "]: ");
                number = scanner.nextInt();
                if (number > start && number < end) {
                    validInput = true;
                } else {
                    throw new Exception("Invalid input. Number must be in the range [" + start + "..." + end + "].");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer number.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return number;
    }
}

