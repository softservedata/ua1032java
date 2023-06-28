package com.softserve.Practical.practical_3.task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = getNumber("Input first number: ", scanner);
        double secondNumber = getNumber("Input second number: ", scanner);
        double total = getTotal(firstNumber, secondNumber);
        double average = getAverage(firstNumber, secondNumber);
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + total);
        System.out.println("The average " + firstNumber + " and " + secondNumber + " is " + average);
    }

    public static double getTotal(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double getAverage(double firstNumber, double secondNumber) {
        return (firstNumber + secondNumber) / 2;
    }

    public static double getNumber(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }
}
