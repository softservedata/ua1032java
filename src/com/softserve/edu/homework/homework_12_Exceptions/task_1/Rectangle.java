package com.softserve.edu.homework.homework_12_Exceptions.task_1;

import java.util.Scanner;

public class Rectangle {
    static int square(int a, int b) throws ArithmeticException {
        if (a < 0 && b < 0)
            throw new ArithmeticException("A rectangle cannot have a negative length and width.");
        else if (a < 0 && b >= 0) {
            throw new ArithmeticException("A rectangle cannot have a negative length.");
        } else if (a >= 0 && b < 0) {
            throw new ArithmeticException("A rectangle cannot have a negative width.");
        }
        return Math.multiplyExact(a, b);
    }

    public static void squareRectangle() {
        int result;
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Please enter the length of the rectangle : ");
            int a = Integer.parseInt(in.nextLine());
            System.out.print("Please enter the width of the rectangle : ");
            int b = Integer.parseInt(in.nextLine());
            result = square(a, b);
        } catch (NumberFormatException e) {
            System.err.println("Error converting string to number");
            result = -1;
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
            result = -1;
        }
        System.out.println("Result = " + result);
    }
}


