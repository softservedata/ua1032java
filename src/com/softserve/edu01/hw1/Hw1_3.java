package com.softserve.edu01.hw1;

import java.util.Scanner;

public class Hw1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstsPhoneCall = "Firsts phone call full cost: ";
        String secondPhoneCall = "Second phone call full cost: ";
        String thirdPhoneCall = "Third phone call full cost: ";
        String totalCostText = "Total cost calls: ";

        System.out.println("Please enter first call cost per minute");
        int firstCallCostPerMinute = sc.nextInt();
        System.out.println("Please enter second call cost per minute");
        int secondCallCostPerMinute = sc.nextInt();
        System.out.println("Please enter third call cost per minute");
        int thirdCallCostPerMinute = sc.nextInt();

        System.out.println("Enter first call time");
        int firstCallTime = sc.nextInt();
        System.out.println("Enter second call time");
        int secondCallTime = sc.nextInt();
        System.out.println("Enter third call time");
        int thirdCallTime = sc.nextInt();

        int firstCallFullCost = firstCallCostPerMinute * firstCallTime;
        int secondCallFullCost = secondCallCostPerMinute * secondCallTime;
        int thirdCallFullCost = thirdCallCostPerMinute * thirdCallTime;
        int totalCost = firstCallFullCost + secondCallFullCost
                + thirdCallFullCost;

        System.out.println(firstsPhoneCall + firstCallFullCost + "\n"
                + secondPhoneCall + secondCallFullCost + "\n" + thirdPhoneCall
                + thirdCallFullCost + "\n" + totalCostText + totalCost);
    }
}

