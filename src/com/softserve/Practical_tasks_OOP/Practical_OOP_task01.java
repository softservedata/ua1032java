package com.softserve.Practical_tasks_OOP;
import java.util.Scanner;
public class Practical_OOP_task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = getNumber(scanner, "Enter the first number: ");
        double num2 = getNumber(scanner, "Enter the second number: ");

        double total = getTotal(num1, num2);
        System.out.println("The sum is: " + total);

        double average = getAverage(num1, num2);
        System.out.println("The average is: " + average);
    }

    public static double getTotal(double num1, double num2) {
        return num1 + num2;
    }

    public static double getAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    public static double getNumber(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }
}
