package com.softserve.java_homework.lesson03;

import java.util.Scanner;

class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input side 1: " );
        double side1 = scanner.nextDouble();
        System.out.print("Input side 2: " );
        double side2 = scanner.nextDouble();
        System.out.print("Input side 3: " );
        double side3 = scanner.nextDouble();
        scanner.close();

        double area = Math.round(getArea(side1, side2, side3) * 100.0) / 100.0;
        System.out.println("The area of the triangle is: : " + area);
    }

    public static double getArea(double a, double b, double c) {
        double sp = (a + b + c) / 2;
        return Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));
    }
}