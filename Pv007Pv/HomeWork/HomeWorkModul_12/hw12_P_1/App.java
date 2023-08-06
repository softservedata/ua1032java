package hw12_P_1;

import java.util.Scanner; // Importing the Scanner class to read input from the keyboard.

/**
 * 1. Create div() method, which calculates the dividing of two double type numbers. In main()
 * method input 2 double numbers and call this method. Catch all exceptions.
 * */

//In Java, dividing a double by zero does not throw an ArithmeticException.
// Instead, it results in Double.POSITIVE_INFINITY if the numerator is positive,
// Double.NEGATIVE_INFINITY if the numerator is negative,
// and Double.NaN (Not-a-Number) if both numerator and denominator are zero.
// https://www.baeldung.com/java-divide-by-zero
//InputMismatchException - if the next token does not match the Double regular expression, or is out of range
public class App {

    // Method for dividing two numbers of type double.
    public static double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed."); // Throw an exception if the second number is zero
        }
        return a / b; // Return the result of dividing the first number by the second number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read input from the keyboard

        try {
            System.out.print("Enter the first number: "); // Displaying a prompt to enter the first number
            double num1 = scanner.nextDouble(); // Reading the first number from the input

            System.out.print("Enter the second number: "); // Displaying a prompt to enter the second number
            double num2 = scanner.nextDouble(); // Reading the second number from the input

            double result = div(num1, num2); // Calling the div() method to perform the division
            System.out.println("Division result: " + result); // Displaying the result of the division
        } catch (Exception e) {
            // Print an error message if an exception occurs during the execution
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Closing the Scanner to release system resources
        }
    }
}
