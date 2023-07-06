package com.softserve.java_practical.lesson03;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        boolean isOdd = false;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println("Odd: " + number);
                isOdd = true;
            }
        }

        if (!isOdd) System.out.println("Odd numbers not found");
    }
}