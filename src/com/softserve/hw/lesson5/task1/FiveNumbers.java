package com.softserve.hw.lesson5.task1;

import java.util.Scanner;

public class FiveNumbers {
    public static void method() {
        int count = 0;
        int product = 1;
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Scanner(System.in).nextInt();
        }
        int min = array[0];
        int numberMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
                if (count == 2) {
                    System.out.println("position of second positive number: " + i);
                }
            }
            if (array[i] < min) {
                min = array[i];
                numberMin = i;
            }
        }
        for (Integer inter : array) {
            if (inter != 0 && inter % 2 == 0) {
                product = product * inter;
            }
        }
        System.out.printf("minimum value: %d\nIts position in the array: %d\n", min, numberMin);
        System.out.printf("Product of all entered even numbers: ", product);
    }
}
