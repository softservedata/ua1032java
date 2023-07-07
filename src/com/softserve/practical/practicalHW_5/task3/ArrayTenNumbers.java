package com.softserve.practical.practicalHW_5.task3;

import java.util.Scanner;

public class ArrayTenNumbers {
    public static int[] createArrayInt() {
        int[] arrayInt = new int[10];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (int) (-50 + Math.random() * 100);
            System.out.println(arrayInt[i]);
        }
        return arrayInt;
    }

    public static int seekMaxValueArray(int[] array) {
        int min = array[0];
        for (Integer inter : array) {
            if (inter < min) {
                min = inter;
            }
        }
        return min;
    }

    public static int sumPositiveNumber(int[] array) {
        int sum = 0;
        for (Integer iter : array) {
            if (iter > 0) {
                sum = sum + iter;
            }
        }
        return sum;
    }

    public static String identifyMorePositiveOrNegative(int[] array) {
        int count = 0;
        for (Integer iter : array) {
            if (iter > 0) {
                count++;
            }
        }
        if (count > array.length / 2) {
            return "There are more positive values in the array.";
        } else if (count < array.length / 2) {
            return "There are more negative values in the array.";
        } else return "There are an equal number of positive and negative values in the array.";
    }
}
