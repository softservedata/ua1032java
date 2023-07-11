package com.softserve.java_practical.lesson03;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = getNumber(scanner, "Enter the first number: ");
        int number2 = getNumber(scanner, "Enter the second number: ");
        scanner.close();

        System.out.println("The sum of " + number1 + " and " + number2 + " is " + getTotal(number1, number2));
        System.out.println("The average of " + number1 + " and " + number2 + " is " + getAverage(number1, number2));
    }

    public static int getNumber(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static int getTotal(int a, int  b) {
        return a + b;
    }

    public static double getAverage(int a, int b) {
        return Math.round(((double) a + b) / 2 * 100.0) / 100.0;
    }
}