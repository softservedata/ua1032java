package com.softserve.Homework.hw_12.task1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter two double numbers: ");
                num1 = scanner.nextDouble();
                num2 = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter two double numbers.");
                scanner.nextLine();
            }
        }
        try {
            double result = div(num1, num2);
            System.out.println("The result of dividing " + num1 + " by " + num2 + " is " + result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static double div(double num1, double num2) throws Exception {
        if (num2 == 0) {
            throw new Exception("Can not divide by zero");
        }
         return num1 / num2;
    }
}

