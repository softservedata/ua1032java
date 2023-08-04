package hm12;

import java.util.Scanner;
/**
 * In Java, dividing a double by zero does not throw an ArithmeticException.
 * Instead, it results in Double.
 * POSITIVE_INFINITY if the numerator is positive,
 * Double.NEGATIVE_INFINITY if the numerator is negative,
 * and Double.NaN (Not-a-Number) if both numerator and denominator are zero.
 *
 * Given this behavior, you don't technically need the ArithmeticException check for dividing doubles
 * and better to add
 * catch (InputMismatchException e) {
 *                 System.out.print("Error: Invalid input. Please enter valid numbers.");
 *
 * */
public class task01 {
    public static class DivisionCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("enter first number:");
                double num1 = scanner.nextDouble();

                System.out.print("enter second number:");
                double num2 = scanner.nextDouble();

                double result = div(num1, num2);

                System.out.print("result of division:" + result);
            } catch (ArithmeticException e) {


                System.out.print("Error: Division by zero is not allowed.");

            } catch (Exception e) {
                System.out.print("Error: Invalid input. Please enter valid numbers.");
            } finally {
                scanner.close();
            }
        }

        private static double div(double num1, double num2) {
            if (num2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return num1 / num2;
        }
    }
}
