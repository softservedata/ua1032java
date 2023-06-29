package com.softserve.Homework_condstate;
import java.util.Scanner;
public class Homework_task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        float number1 = scanner.nextFloat();

        System.out.println("Enter the second number: ");
        float number2 = scanner.nextFloat();

        System.out.println("Enter the third number: ");
        float number3 = scanner.nextFloat();

        boolean allInRange = checkRange(number1) && checkRange(number2) && checkRange(number3);

        if (allInRange) {
            System.out.println("All numbers are within the range [-5, 5].");
        } else {
            System.out.println("At least one number is outside the range [-5, 5].");
        }
    }

    public static boolean checkRange(float number) {
        return number >= -5 && number <= 5;
    }
}
