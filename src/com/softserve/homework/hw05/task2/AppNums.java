package com.softserve.homework.hw05.task2;

import java.util.Scanner;

public class AppNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input=0;
        do {
            IntNums nums = IntNums.inputNums();
            System.out.println("Product of " + nums.getNumber1() + " and " + nums.getNumber2() + " = " + IntNums.calculateProduct(nums));
            System.out.print("Input positive to restart: ");
            input = sc.nextInt();
        }while (input > 0);

    }
}
