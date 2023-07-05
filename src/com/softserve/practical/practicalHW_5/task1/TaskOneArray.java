package com.softserve.practical.practicalHW_5.task1;

import java.util.Arrays;
import java.util.Scanner;

public class TaskOneArray {
    public static String[] stringArraySort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input counter of  String: ");
        String[] array = new String[sc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.next();
        }
        Arrays.sort(array);
        for (String str : array) {
            System.out.println(str);
        }
        return array;
    }

    public static int[] intArrayAVG() {
        double result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input counter of  Integer: ");
        int[] array = new int[sc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            result += result + array[i];
        }
        for (Integer intA : array) {
            System.out.println(intA);
        }
        System.out.println(result / array.length);
        return array;
    }

    public static boolean methodCheck(int[] arr) {
        boolean result = false;
        int numberCheck = new Scanner(System.in).nextInt();
        for (Integer inte : arr) {
            if (inte == numberCheck) {
                result = true;
            }
        }
        return result;
    }
}
