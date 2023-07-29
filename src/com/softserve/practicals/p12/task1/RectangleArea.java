package com.softserve.practicals.p12.task1;
/*
It is required to create a method named squareRectangle that takes two integer parameters "a" and "b"
and calculates the area of a rectangle: int squareRectangle (int a, int b),
In case the user enters negative values, the method should throw an exception.
The values of "a" and "b" should be taken as input from the console.
It is recommended to check the correctness of the squareRectangle() method in the main() method.
Furthermore, it is necessary to verify that the input values are numeric and handle non-numeric input accordingly.

 */

import com.softserve.homework.MyScanner.MyScannerClass;

import java.util.InputMismatchException;

public class RectangleArea {
        public static int squareRectangle(int a, int b) throws IllegalArgumentException {
            if (a < 0 || b < 0) {
                throw new IllegalArgumentException("Both dimensions must be non-negative.");
            }
            return a * b;
        }

        public static void main(String[] args) {
            MyScannerClass myScanner = new MyScannerClass();


            boolean continueInput = true; // додана змінна для управління циклом

            do {
                try {
                    System.out.println("Enter the two dimensions of the rectangle:");

                    System.out.print("a: ");
                    int a = myScanner.readInt();

                    System.out.print("b: ");
                    int b = myScanner.readInt();

                    int area = squareRectangle(a, b);
                    System.out.println("The area of the rectangle is: " + area);

                    continueInput = false; // завершити цикл, якщо все пройшло добре

                } catch (InputMismatchException e) {
                    System.out.println("Please enter valid numeric values.");
                    myScanner.closeScanner();
//                    scanner.nextLine(); // очистити вхідний потік
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } while (continueInput); // продовжуємо цикл, якщо сталася помилка
        }
}