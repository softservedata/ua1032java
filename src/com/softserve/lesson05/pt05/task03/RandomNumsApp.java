package com.softserve.lesson05.pt05.task03;

import java.util.Random;

public class RandomNumsApp {

    static int getMaxNum (int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max) {
                max = nums[i];
            }
        }
        return max;
    }

    static int getPositiveSum (int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                sum+=nums[i];
            }
        }
        return sum;
    }

    static int getPositiveCount (int[] nums) {
        int positiveNums = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positiveNums++;
            }
        }
        return positiveNums;
    }

    static int getNegativeCount (int[] nums) {
        int negativeNums = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negativeNums++;
            }
        }
        return negativeNums;
    }
    static void compareNumsCount (int positive, int negative) {
        if (negative > positive) {
            System.out.println("There are more negative values in the array.");
        }
        else if (positive > negative) {
            System.out.println("There are more positive values in the array.");
        }
        else
            System.out.println("There are an equal number of positive and negative values in the array.");
    }

    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
            System.out.println(arr[i]);
        }
        System.out.print("The biggest number of array is: " + getMaxNum(arr) + "\n");
        System.out.print("The sum of positive numbers is: " + getPositiveSum(arr) + "\n");
        System.out.print("Count of the negative numbers: " + getNegativeCount(arr) + "\n");
        compareNumsCount(getPositiveCount(arr), getNegativeCount(arr));
    }
}
