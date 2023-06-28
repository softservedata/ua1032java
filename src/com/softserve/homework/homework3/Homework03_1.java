package com.softserve.homework.homework3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Homework03_1 {
    // TODO: Write Java console application with method to calculate the area of a triangle.

    public static double calculateArea(int a, int b, int c){
        double s; // Semi Perimeter
        double area; // Area of the triangle

        s = (double) (a + b + c) / 2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        return Math.round(area*100.0)/100.0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int side1;
        int side2;
        int side3;

        System.out.print("Input Side 1: ");
        side1 = Integer.parseInt(br.readLine());
        System.out.print("Input Side 2: ");
        side2 = Integer.parseInt(br.readLine());
        System.out.print("Input Side 3: ");
        side3 = Integer.parseInt(br.readLine());

        System.out.print("The area of the triangle is " + calculateArea(side1, side2, side3));
    }
}
