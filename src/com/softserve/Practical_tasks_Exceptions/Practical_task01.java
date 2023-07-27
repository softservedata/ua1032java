package com.softserve.Practical_tasks_Exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Practical_task01 {

    public static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Input values cannot be negative.");
        }
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        try {
            System.out.print("Enter the length of the rectangle (a): ");
            a = scanner.nextInt();
            System.out.print("Enter the width of the rectangle (b): ");
            b = scanner.nextInt();

            int area = squareRectangle(a, b);
            System.out.println("The area of the rectangle is: " + area);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric values only.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}