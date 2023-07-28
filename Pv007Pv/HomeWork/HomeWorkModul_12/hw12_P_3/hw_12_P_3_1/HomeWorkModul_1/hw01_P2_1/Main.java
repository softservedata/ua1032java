package hw12_P_3.hw_12_P_3_1.HomeWorkModul_1.hw01_P2_1;

import java.util.Scanner;

/**1. Flower bed is shaped like a circle.
 Calculate its perimeter and area. Input the radius
 from the console, and output obtained results.*/
// Import the Scanner class from the java.util package


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double R = 0;

        try {
            System.out.print("Input radius circle: " + System.lineSeparator() + "(Example 5 or 2.5): ");
            R = Double.parseDouble(input.nextLine());

            if (R <= 0) {
                throw new ArithmeticException("Radius must be a positive number.");
            }

            double PI = Math.PI;
            double l = 2 * PI * R;
            double S = PI * R * R;

            System.out.printf("Perimeter: " + "%.2f%n", l);
            System.out.printf("Area: " + "%.2f%n", S);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number for the radius.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            input.close();
        }
    }
}
