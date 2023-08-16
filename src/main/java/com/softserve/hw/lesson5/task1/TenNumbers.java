package com.softserve.hw.lesson5.task1;

import java.util.Scanner;

public class TenNumbers {
    public static long addOrMultiply() {
        long product = 1;
        long sum = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Scanner(System.in).nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (i < 5 && array[i] > 0) {
                sum += array[i];
            } else if (i >= 5) {
                product *= array[i];
            }
        }
        if (sum > 0) {
            return sum;
        } else {
            return product;
        }
    }
}
