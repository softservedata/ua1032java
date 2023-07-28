package hw12_P_3.hw_12_P_3_3.HomeWorkModul_3.hw04_P-1;

import java.util.Scanner;

/**1. Java console application with method to calculate the area of a triangle. */

public class AreaTriangle {
    /*
    The AreaTriangleHeron method returns the area of
    a triangle on three sides using
    Heron's formula : S = sqrt(p * (p - a) * (p - b) * (p - c)), (p = (a + b + c) / 2)
    */
    public static double AreaTriangleHeron(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Input Side 1: ");
            double t1 = Double.parseDouble(input.nextLine());

            System.out.println("Input Side 2: ");
            double t2 = Double.parseDouble(input.nextLine());

            System.out.println("Input Side 3: ");
            double t3 = Double.parseDouble(input.nextLine());

            if (t1 <= 0 || t2 <= 0 || t3 <= 0) {
                throw new IllegalArgumentException("Side length must be a positive number.");
            }

            // Outputting the area of the triangle
            System.out.printf("The area of the triangle is " + "%.2f%n", AreaTriangleHeron(t1, t2, t3));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numeric values for the sides of the triangle.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            input.close();
        }
    }
}
