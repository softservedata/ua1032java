package com.softserve.hm01;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the radius of the circle:");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Perimeter of a circle: " + perimeter);
        System.out.println("Circle area: " + area);

        scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("Where do you live, " + name + "? ");
        String address = scanner.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Address: " + address);

        scanner = new Scanner(System.in);

        // Input the source data
        System.out.print("Enter the cost per minute for call 1: ");
        double c1 = scanner.nextDouble();

        System.out.print("Enter the duration of call 1 (in minutes): ");
        double t1 = scanner.nextDouble();

        System.out.print("Enter the cost per minute for call 2: ");
        double c2 = scanner.nextDouble();

        System.out.print("Enter the duration of call 2 (in minutes): ");
        double t2 = scanner.nextDouble();

        System.out.print("Enter the cost per minute for call 3: ");
        double c3 = scanner.nextDouble();

        System.out.print("Enter the duration of call 3 (in minutes): ");
        double t3 = scanner.nextDouble();
// Calculate the cost of each call
        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;

        // Calculate the total cost
        double totalCost = cost1 + cost2 + cost3;

        // Output the results
        System.out.println("Cost of call 1: " + cost1);
        System.out.println("Cost of call 2: " + cost2);
        System.out.println("Cost of call 3: " + cost3);
        System.out.println("Total cost: " + totalCost);
    }

}

