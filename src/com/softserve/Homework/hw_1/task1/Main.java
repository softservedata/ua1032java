package com.softserve.Homework.hw_1.task1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //Task 1
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the radius of the flower bed: ");
        double radius = Double.parseDouble(reader.readLine());
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The perimeter of the flower bed is: " + perimeter);
        System.out.println("The area of the flower bed is: " + area);
    }
}