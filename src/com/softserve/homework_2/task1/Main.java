package com.softserve.homework_2.task1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("Input Side 1: ");
        double side1 = Double.parseDouble(reader.readLine());

        System.out.printf("Input Side 2: ");
        double side2 = Double.parseDouble(reader.readLine());

        System.out.printf("Input Side 3: ");
        double side3 = Double.parseDouble(reader.readLine());

        double area = calculateArea(side1, side2, side3);
        System.out.println("The total area of the triangle is: " + area);
    }

    public static double calculateArea(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
