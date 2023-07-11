package com.softserve.java_homework.lesson05;

import java.util.Scanner;

public class Task012 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        inputNumbers(numbers);
        sumFirstOrLastFiveValues(numbers);
    }

    public static void inputNumbers(int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integer numbers.");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter: ");
            while (!scanner.hasNextInt()) {
                System.out.print("\nInvalid number. Enter an integer: ");
                scanner.next();
            }
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public static boolean firstFiveValuesArePositive(int[] numbers) {
        for (int i = 0; i < 5; i++) {
            if (numbers[i] < 0) return false;
        }
        return true;
    }

    public static void sumFirstOrLastFiveValues(int[] numbers) {
        int sum = 0;
        if (firstFiveValuesArePositive(numbers)) {
            for (int i = 0; i < numbers.length -5; i++) {
                sum += numbers[i];
            }
            System.out.println("\nThe sum of the first five numbers: " + sum);
        } else {
            for (int i = 5; i < numbers.length; i++) {
                sum += numbers[i];
            }
            System.out.println("\nThe sum of the last five numbers: " + sum);
        }
    }
}