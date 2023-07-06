package com.softserve.homework.hw05.task1;

import java.util.Scanner;

public class Numbers10 {
    public static int[] inputArray(int size) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[size];

        System.out.println("Input "+size+" int numbers: ");
        for (int i = 0; i < array.length; ) {
            String input = sc.nextLine();
            try {
                int integer = Integer.parseInt(input);
                array[i] = integer;
                i++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
                continue;
            }
        }
        return array;
    }

    public static void outputArray(int[] array){
        System.out.println("ARRAY: ");
        for (int current : array) {
            System.out.print(current + " ");
        }
        System.out.println();
    }

    public static int calculate(int[] array) {
        boolean isPositive = true;
        int sum = 0;
        int prod = 0;

        for (int current: array) {
            if (current < 0) {
                isPositive = false;
                prod = 1;
                break;
            }
        }
        for (int i = 0; i < 5; i++) {
            if (i < array.length) {
                int current = array[i];
                sum += current;
                prod *= current;
            } else {
                break;
            }
        }
        return isPositive ? sum : prod;
    }
}
