package com.softserve.hw.Lesson1;

import java.util.Scanner;

public class homeWorkOne {
    public static void main(String[] args) {

        perimeterAndAreaCircle();
        System.out.println();
        humanInfo();
        System.out.println();
        System.out.println("Total cost: " + phone());

    }

    public static void perimeterAndAreaCircle() {
        System.out.print("Please input radius circle: ");
        double radius = new Scanner(System.in).nextDouble();
        double perimeter = 2 * radius * Math.PI;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("""
                Radius circle= %.2f
                Circle perimeter = %.2f
                Area of a circle = %.2f""" + "\n", radius, perimeter, area);
    }

    public static void humanInfo() {
        String name;
        String address;
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name?");
        name = sc.nextLine();
        System.out.println("Where do you live, " + name);
        address = sc.nextLine();
        System.out.printf("Your name %s and you live in %s\n", name, address);
    }

    public static double phone() {
        double result = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("Time call?");
            double minute = sc.nextDouble();
            System.out.println("Cost call?");
            double costMinute = sc.nextDouble();
            double oneCostCall = minute * costMinute;
            System.out.printf("""
                    %d call
                    his cost:%.2f
                    his minutes:%.2f
                    total call cost:%.2f
                    """, i, costMinute, minute, oneCostCall);
            result += oneCostCall;
        }
        return result;
    }
}
