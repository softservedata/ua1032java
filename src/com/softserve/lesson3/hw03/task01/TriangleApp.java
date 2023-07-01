package com.softserve.lesson3.hw03.task01;

public class TriangleApp {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.input();
        System.out.println("The area of the triangle is: " + triangle.getArea());
    }
}
