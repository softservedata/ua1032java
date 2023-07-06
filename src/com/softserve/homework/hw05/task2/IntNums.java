package com.softserve.homework.hw05.task2;

import java.util.Scanner;

public class IntNums {
    private final double number1;
    private final double number2;

    public IntNums(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public static int calculateProduct(IntNums nums){
        return (int) (nums.number1 * nums.number2);
    }

    public static IntNums inputNums() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input 2 nums: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        return new  IntNums(num1, num2);
    }
}
