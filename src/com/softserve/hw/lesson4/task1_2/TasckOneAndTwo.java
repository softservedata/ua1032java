package com.softserve.hw.lesson4.task1_2;

import java.util.Scanner;

public class TasckOneAndTwo {
    public static void range() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter number: ");
            double n = sc.nextDouble();
            if (n >= -5 && n <= 5) {
                System.out.println("These number are in the range -5, 5: " + n);
            } else
                System.out.println("These number are not in the range -5, 5: " + n);
        }

    }

    public static void maxAndMin() {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter number: ");
            array[i] = sc.nextInt();
        }
        int max = Math.max(Math.max(array[0], array[1]), array[2]);
        int min = Math.min(Math.min(array[0], array[1]), array[2]);
        System.out.printf("Max= %d\nMin= %d\n", max, min);

    }

}
