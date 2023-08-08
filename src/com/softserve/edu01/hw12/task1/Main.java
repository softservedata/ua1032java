package com.softserve.edu01.hw12.task1;

import java.util.Scanner;

import static com.softserve.edu01.hw12.task1.Method.div;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first number");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second number");
            double num2 = scanner.nextDouble();
            double result = div(num1, num2);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Another exception " + e.getMessage());
        }
    }
}
