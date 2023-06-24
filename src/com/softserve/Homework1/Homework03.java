package com.softserve.Homework1;
import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Phone Call Cost Calculator!");

        System.out.print("Enter the cost per minute for the first call: ");
        double c1 = scanner.nextDouble();

        System.out.print("Enter the duration of the first call in minutes: ");
        double t1 = scanner.nextDouble();

        System.out.print("Enter the cost per minute for the second call: ");
        double c2 = scanner.nextDouble();

        System.out.print("Enter the duration of the second call in minutes: ");
        double t2 = scanner.nextDouble();

        System.out.print("Enter the cost per minute for the third call: ");
        double c3 = scanner.nextDouble();

        System.out.print("Enter the duration of the third call in minutes: ");
        double t3 = scanner.nextDouble();

        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;
        double totalCost = cost1 + cost2 + cost3;

        System.out.println("Cost of the first call: $" + cost1);
        System.out.println("Cost of the second call: $" + cost2);
        System.out.println("Cost of the third call: $" + cost3);
        System.out.println("Total cost of all calls: $" + totalCost);

        scanner.close();
    }
}