package com.softserve.java_practical.lesson01;

import java.util.Scanner;

class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = getAverage(scanner, "Enter a number: ");
        scanner.close();
        System.out.println("Average: " + average);
    }

    public static double getAverage(Scanner scanner, String prompt) {
        double[] numbers = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print(prompt);
            numbers[i] = scanner.nextDouble();
        }
        return Math.round(((numbers[0] + numbers[1] + numbers[2]) / 3) * 100.0) / 100.0;
    }
}