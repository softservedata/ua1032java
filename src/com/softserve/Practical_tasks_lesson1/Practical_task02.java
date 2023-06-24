package com.softserve.Practical_tasks_lesson1;
import java.util.Scanner;
public class Practical_task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Average Calculator!");

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = scanner.nextDouble();

        double average = (number1 + number2 + number3) / 3;

        System.out.println("The average of the numbers is: " + average);

        scanner.close();
    }
}
