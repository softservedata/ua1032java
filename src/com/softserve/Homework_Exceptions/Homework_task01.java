package com.softserve.Homework_Exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
//у даблів немає арифметичного ексепшину при діленні на нуль, там буде бескінечність
public class Homework_task01 {
    public static double div(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        try {
            System.out.print("Enter the first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();

            double result = div(num1, num2);
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid double numbers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}