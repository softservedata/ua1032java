package com.softserve.hw.lesson12.task1;

public class DivisionHandler {
    public static double divide(double a, double b) {
        // Check for division by zero
        if (b == 0.0) {
            System.err.println("Error: Attempted division by zero!");
            return Double.NaN; // Return NaN (Not a Number)
        }

        double result = a / b;

        // Check for overflow
        if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
            System.err.println("Error: Overflow in result!");
            return Double.POSITIVE_INFINITY; // Return infinity
        }

        // Check for underflow
        if (Math.abs(result) > 0 && Math.abs(result) < Double.MIN_NORMAL) {
            System.err.println("Error: Underflow in result!");
            return 0.0; // Return zero
        }

        return result; // Return valid result
    }

    public static void main(String[] args) {
        double a = 10.0;
        double b = 0.0;

        double result = divide(a, b);
        if (!Double.isNaN(result) && !Double.isInfinite(result)) {
            System.out.println("Result: " + result);
        }
    }
}
