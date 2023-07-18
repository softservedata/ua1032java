package com.softserve.hw03.Task01;

public class Main1 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 6, 3);
        System.out.println("Input Side 1: " + triangle.getA());
        System.out.println("Input Side 2: " + triangle.getB());
        System.out.println("Input Side 3: " + triangle.getC());
        System.out.println("The area of the triangle is " + triangle.CalculateTheArea());
    }
}
