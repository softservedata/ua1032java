package com.softserve.hw.lesson3;

import java.util.Scanner;

public class TaskTwo {
    public static int seekSmallestNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number : ");
        int firstNumber = sc.nextInt();
        System.out.println("Input the first number : ");
        int secondNumber = sc.nextInt();
        System.out.println("Input the first number : ");
        int thirdNumber = sc.nextInt();
        int min = Math.min(firstNumber, secondNumber);
        min = Math.min(min, thirdNumber);
        return min;
    }
}
