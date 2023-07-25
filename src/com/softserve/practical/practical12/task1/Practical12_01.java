package com.softserve.practical.practical12.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practical12_01 {
    // TODO: It is required to create a method named squareRectangle that takes two integer parameters "a" and "b" and
    //      calculates the area of a rectangle: int squareRectangle (int a, int b),
    //      In case the user enters negative values, the method should throw an exception. The values of "a" and "b" should be
    //      taken as input from the console. It is recommended to check the correctness of the squareRectangle() method in the
    //      main() method. Furthermore, it is necessary to verify that the input values are numeric and handle non-numeric
    //      input accordingly.

    public static int squareRectangle(int a, int b) throws IllegalArgumentException {
        try {
            if(a <= 0 || b <= 0) throw new IllegalArgumentException("Values must be positive!");
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException(e.getMessage());
        }

        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int result;

        try {
            System.out.print("Enter size of A side: ");
            a = sc.nextInt();
            System.out.print("Enter size of B side: ");
            b = sc.nextInt();

            result = squareRectangle(a, b);
            System.out.printf("Area of a rectangle is: %s", result);
        } catch (InputMismatchException e) {
            System.err.println("Value must be integer!");
        } catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
}
