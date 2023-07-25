package com.softserve.homework.hw12.task1;

import java.util.Scanner;

public class AppDividing {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input a: ");
            double a = sc.nextDouble();
            System.out.println("Input b: ");
            double b = sc.nextDouble();
            double result = Dividing.div(a, b);
            System.out.println(a + " / " + b + "  = " + result);
        } catch (ArithmeticException e) {
            System.err.println("Arithmetical error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
