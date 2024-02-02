package com.softserve.edu.practical.Practical_tasks_05_arrays_loops.task_3;

import java.util.Arrays;

public class GenerateNumber {
    public static int[] generateArray(int[] randomNumbers){
        for(int index = 0; index < randomNumbers.length; index++){
            randomNumbers[index] = (int) (Math.random()*201) - 100;
        }
        return randomNumbers;
    }
    public static int biggest_number(int[] randomNumbers){
        int maxNumber = Integer.MIN_VALUE;
        for (int number : randomNumbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }
    public static int sum_positive_numbers(int[] randomNumbers){
        int sum_num = 0;
        for (int number : randomNumbers){
            if (number > 0){
                sum_num += number;
            }
        }
        return sum_num;
    }
    public static int count_negative_numbers(int[] randomNumbers){
        int negative_numbers = 0;
        for (int number : randomNumbers){
            if(number < 0){
                negative_numbers += 1;
            }
        }
        return negative_numbers;
    }
    public static int count_positive_numbers(int[] randomNumbers){
        int positive_numbers = 0;
        for (int number : randomNumbers){
            if(number > 0){
                positive_numbers += 1;
            }
        }
        return positive_numbers;
    }
    public static int comparison(int[] randomNumber){
        if (count_positive_numbers(randomNumber) > count_negative_numbers(randomNumber)){
            return 1;
        } else if (count_positive_numbers(randomNumber) < count_negative_numbers(randomNumber)) {
            return -1;
        }
        else {
            return 0;
        }
    }
    public static void main(String[]args){
        int[] randomNumbers = new int[10];
        System.out.println(Arrays.toString(generateArray(randomNumbers)));
        System.out.println(biggest_number(randomNumbers));
        System.out.println(sum_positive_numbers(randomNumbers));
        System.out.println(count_negative_numbers(randomNumbers));
        if(comparison(randomNumbers) == 1){System.out.println("There are more positive numbers.");
        } else if (comparison(randomNumbers) == -1) {System.out.println("There are more negative numbers.");
        } else {System.out.println("The counts of positive and negative numbers are equal.");}
    }
}
