package com.softserve.edu01.practical3;

import java.util.Scanner;

public class Practical3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = getNumber(scanner, "Введи перше чило:");
        double num2 = getNumber(scanner, "Введи друге число:");

        double total = getTotal(num1, num2);
        double average = getAverage(num1, num2);

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        scanner.close();


    }
    public static double getTotal(double num1, double num2) {
        return num1 + num2;
    }

    public static double getAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    public static double getNumber(Scanner scanner, String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }
}