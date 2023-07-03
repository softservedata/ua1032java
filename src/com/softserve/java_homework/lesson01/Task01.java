package com.softserve.java_homework.lesson01;

import java.util.Scanner;

class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double radius = scanner.nextDouble();
        scanner.close();

        double perimeter = getPerimeter(radius);
        double area = getArea(radius);

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }

    public static double getPerimeter(double radius) {
        return Math.round(2 * Math.PI * radius * 100.0) / 100.0;
    }

    public static double getArea(double radius) {
        return Math.round(Math.PI * Math.pow(radius, 2) * 100.0) / 100.0;
    }
}