package homework;

import java.util.Scanner;

// Task 1. Write Java console application with method to calculate the area of a triangle.

public class TaskOne {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first side of an arbitrary triangle: ");
        double s1 = scanner.nextDouble();
        System.out.println("Input the second side of an arbitrary triangle: ");
        double s2 = scanner.nextDouble();
        System.out.println("Input the third side of an arbitrary triangle: ");
        double s3 = scanner.nextDouble();

        double area = calculateArea(s1, s2, s3);
        System.out.printf("The area of an arbitrary triangle is: %.2f\n", area);
        scanner.close();

    }

    private static double calculateArea(double s1, double s2, double s3) {
        double semiPerimeter = (s1 + s2 + s3) / 2;
        double heronFormula = Math.sqrt(semiPerimeter * (semiPerimeter - s1) * (semiPerimeter - s2) * (semiPerimeter - s3));
        return heronFormula;
    }
}
