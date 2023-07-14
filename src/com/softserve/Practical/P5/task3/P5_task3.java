package com.softserve.Practical.P5.task3;

import java.util.Arrays;
import java.util.Random;

public class P5_task3 {
    public static int random(int a, int b) {
        Random random = new Random();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return random.nextInt((max - min) + 1) + min;
    }
    public static int maxElementNum(final int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (max < array[i]){
                max = array[i];
            }
        }

        return max;
    }
    public static int minElement(final int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
    public static int sumPositiveNum(final int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i]>0){
                sum += array[i];
            }
        }
        return sum;
    }
    public static int countNegativeNum(final int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i]<0){
                count++;
            }
        }
        return count;
    }
    public static int countPositiveNum(final int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i]>0){
                count++;
            }
        }
        return count;
    }
    public static String countNegativePositive(int[] array){
        int positive = countPositiveNum(array);
        int negative = countNegativeNum(array);
        if (positive > negative){
            return "There are more positive values in the array.";
        }else if (negative < positive) {
            return "There are more negative values in the array.";
        }else {
            return "There are an equal number of positive and negative values in the array.";
        }
    }
    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        int a = -10;
        int b = 10;
        for(int i = 0; i < size; i++){
            array[i] = random(-10,10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("The biggest number in the array: "+ maxElementNum(array));
        System.out.println("The smallest number in the array: " + minElement(array));
        System.out.println("The sum of positive numbers: " + sumPositiveNum(array));
        System.out.println("Count the number of negative numbers: " + countNegativeNum(array));
        System.out.println("Count the number of positive numbers: " + countPositiveNum(array));
        System.out.println(countNegativePositive(array));
    }
}
