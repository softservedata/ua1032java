package com.softserve.hw.lesson5.task2;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void addNumber() {
        Scanner sc = new Scanner(System.in);
        do {
            double numberOne = sc.nextDouble();
            double numberTwo = sc.nextDouble();
            System.out.println(numberOne + numberTwo);
            System.out.println("Repeat these method?");
        }
        while (sc.next().equals("Yes"));
    }
}
