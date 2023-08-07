package homeworkOne;

/* Create div() method, which calculates the dividing of two double type numbers.
   In main() method input 2 double numbers and call this method. Catch all exceptions. */

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;

        System.out.println("Input double a: ");
        try {
            a = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Input double number format please!");
        }

        System.out.println("Input double b: ");
        try {
            b = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Input double number format please!");
        }

        try {
            double result = div(a, b);
            System.out.printf("The division a by b is: " + String.format("%.2f", result));
        } catch (ArithmeticException e) {
            System.err.println("If you divide by zero, you will get an infinity.");
        } catch (Exception e) {
            System.err.println("Exception regarding " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("If you divide by zero, you will get an infinity.");
        }
        return a / b;
    }
}



