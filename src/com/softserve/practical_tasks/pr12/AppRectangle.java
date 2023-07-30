package com.softserve.practical_tasks.pr12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Input a: ");
                int a = sc.nextInt();

                System.out.print("Input b: ");
                int b = sc.nextInt();

                int square = Rectangle.squareRectangle(a, b);
                System.out.println("Square = " + square);
                break;
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Error: Input valid int a and b.");
                sc.nextLine();
            }
        }
    }
}
