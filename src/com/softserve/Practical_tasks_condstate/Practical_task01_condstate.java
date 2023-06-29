package com.softserve.Practical_tasks_condstate;
import java.util.Scanner;
public class Practical_task01_condstate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int number3 = scanner.nextInt();

        int oddCount = 0;

        if (number1 % 2 != 0) {
            oddCount++;
        }

        if (number2 % 2 != 0) {
            oddCount++;
        }

        if (number3 % 2 != 0) {
            oddCount++;
        }

        System.out.println("Number of odd numbers: " + oddCount);
    }
}
