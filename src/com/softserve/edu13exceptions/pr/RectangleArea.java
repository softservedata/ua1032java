package com.softserve.edu13exceptions.pr;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RectangleArea {

    public static int squareRectangle(int a, int b) throws IllegalArgumentException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Both dimensions must be non-negative.");
        }
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two dimensions of the rectangle:");

        try {
            System.out.print("a: ");
            int a = scanner.nextInt();

            System.out.print("b: ");
            int b = scanner.nextInt();

            int area = squareRectangle(a, b);
            System.out.println("The area of the rectangle is: " + area);

        } catch (InputMismatchException e) {
            System.out.println("Please enter valid numeric values.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}