package com.softserve.Practical.practical_5.task3;


import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The biggest number in the array is: " + max);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        System.out.println("The sum of positive numbers is: " + sum);

        int countNegative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                countNegative++;
            }
        }
        System.out.println("The number of negative numbers is: " + countNegative);

        if (countNegative > array.length - countNegative) {
            System.out.println("There are more negative values in the array.");
        } else if (countNegative < array.length - countNegative) {
            System.out.println("There are more positive values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }
    }
}

