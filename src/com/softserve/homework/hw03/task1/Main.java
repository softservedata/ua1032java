package com.softserve.homework.hw03.task1;

import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();

        double area = TriangleArea.calculateTriangleArea(side1, side2, side3);

        String roundedArea = String.format("%.2f", area);

        System.out.println("The area of the triangle is: " + roundedArea);

        Scanner close;

    }
}
