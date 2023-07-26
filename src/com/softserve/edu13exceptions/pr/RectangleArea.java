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

        boolean continueInput = true; // додана змінна для управління циклом

        do {
            try {
                System.out.println("Enter the two dimensions of the rectangle:");

                System.out.print("a: ");
                int a = scanner.nextInt();

                System.out.print("b: ");
                int b = scanner.nextInt();

                int area = squareRectangle(a, b);
                System.out.println("The area of the rectangle is: " + area);

                continueInput = false; // завершити цикл, якщо все пройшло добре

            } catch (InputMismatchException e) {
                System.out.println("Please enter valid numeric values.");
                scanner.nextLine(); // очистити вхідний потік
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (continueInput); // продовжуємо цикл, якщо сталася помилка
    }
}