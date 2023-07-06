package com.softserve.homework.hw03.task1;

import java.util.Scanner;

public class AppTriangle {
    public static void main(String[] args) {
        double side1;

        double side2;

        double side3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input Side 1: ");
        side1 = sc.nextDouble();

        System.out.println("Input Side 2: ");
        side2 = sc.nextDouble();

        System.out.println("Input Side 3: ");
        side3 = sc.nextDouble();

        Triangle triangle1 = new Triangle(side1, side2, side3);

        System.out.println(triangle1);

        System.out.println("The area of the triangle is " + Triangle.findArea(side1, side2, side3));
        sc.close();
    }
}
