package com.softserve.java_homework.lesson01;

import java.util.Scanner;

class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a country:");
        String country01 = scanner.nextLine();
        System.out.print("Enter a country:");
        String country02 = scanner.nextLine();
        System.out.print("Enter a country:");
        String country03 = scanner.nextLine();


        System.out.println("You have entered " + country01 + ", " + country02 + " and " + country03);

        System.out.print("Enter the call cost per minute to " + country01 + ": ");
        double c1 = scanner.nextDouble();
        System.out.print("Enter the call cost per minute to " + country02 + ": ");
        double c2 = scanner.nextDouble();
        System.out.print("Enter the call cost per minute to " + country03 + ": ");
        double c3 = scanner.nextDouble();

        System.out.print("Enter the duration of call to " + country01 + " in minutes: ");
        double d1 = scanner.nextDouble();
        System.out.print("Enter the duration of call to " + country02 + " in minutes: ");
        double d2 = scanner.nextDouble();
        System.out.print("Enter the duration of call to " + country03 + " in minutes: ");
        double d3 = scanner.nextDouble();

        double costOfCall1 = Math.round(c1 * d1 * 100.0) / 100.0;
        double costOfCall2 = Math.round(c2 * d2 * 100.0) / 100.0;
        double costOfCall3 = Math.round(c3 * d3 * 100.0) / 100.0;
        double totalMinutes = d1 + d2 + d3;
        double totalCost = costOfCall1 + costOfCall2 + costOfCall3;

        System.out.println("The call to " + country01 + " with duration of " + d1 + " minutes costs: $" + costOfCall1);
        System.out.println("The call to " + country02 + " with duration of " + d2 + " minutes costs: $" + costOfCall2);
        System.out.println("The call to " + country03 + " with duration of " + d3 + " minutes costs: $" + costOfCall3);
        System.out.println("The total cost for " + totalMinutes + " minutes is: $" + totalCost);
    }
}