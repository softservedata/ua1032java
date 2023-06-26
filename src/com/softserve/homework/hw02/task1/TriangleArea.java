package com.softserve.homework.hw02.task1;

public class TriangleArea {

    public static double calculateTriangleArea ( double side1, double side2, double side3 ) {
        double semiPerimeter = (side1 + side2 + side3) / 2;

        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));

        return area;
    }
}