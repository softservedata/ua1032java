package com.softserve.java_practical.lesson12;

import java.util.Scanner;

public class Task01 {
        static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        try {
            int a = getNumeric(scanner, "Enter the value for length: ");
            int b = getNumeric(scanner, "Enter the value for width: ");

            int area = squareRectangle(a, b);
            System.out.println("Area of the rectangle: " + area);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int squareRectangle(int a, int b) {
        if (a <= 0 || b <= 0) throw new IllegalArgumentException("Invalid input. The value must be greater than zero.");
        return a * b;
    }

    public static int getNumeric(Scanner scanner, String prompt) {
        String p = "\\d+";
        int inputInt;
        do {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (!input.matches(p)) {
                System.out.println("Invalid input. The value must be a numeric integer.");
                continue;
            }
            inputInt = Integer.parseInt(input);
            break;
        } while (true);
        return inputInt;
    }
}

