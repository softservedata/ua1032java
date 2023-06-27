package com.softserve.HomevorkOOP;
import java.util.Scanner;
public class HomeworkOOP_task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base length of the triangle:");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the triangle:");
        double height = scanner.nextDouble();

        double area = calculateTriangleArea(base, height);
        System.out.println("The area of the triangle is: " + area);
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}
