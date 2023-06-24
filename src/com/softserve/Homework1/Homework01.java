package com.softserve.Homework1;
import java.util.Scanner;


public class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Flower Bed Calculator!");

        System.out.print("Enter the radius of the flower bed: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("Perimeter of the flower bed: %.2f%n", perimeter);
        System.out.printf("Area of the flower bed: %.2f%n", area);

        scanner.close();
    }
}