package com.softserve.edu13exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = divide(5, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("It`s finally block! Always executed");
        }
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Div by zero is not allowed for integer numbers");
        }
        return a / b;
    }
}
