package com.softserve.homework.homework5.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Homework05_01_02 {
    // TODO: Create a program (in different java documents) that prompts the user to enter:
    //      - 10 integers numbers and calculates the sum of the first five elements if they are
    //      positive, or the product of the last five elements if they are not and output the result.

    public static boolean isSumPositive(int[] numbers){
        boolean isSumPositive = true;

        for(int i = 0; i < 5; i++){
            if(numbers[i] < 0){
                isSumPositive = false;
                break;
            }
        }

        return isSumPositive;
    }

    public static int calcNumbersSum(int[] numbers){
        int sum = 0;

        for(int i = 0; i < 5; i++){
            sum += numbers[i];
        }

        return sum;
    }

    public static int calcNumbersProduct(int[] numbers){
        int product = 1;

        for(int i = 5; i < 10; i++){
            product *= numbers[i];
        }

        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        boolean isSumPositive = true;
        int sum = 0;
        int product = 1;

        System.out.println("Enter 10 integer numbers: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Entered numbers: " + Arrays.toString(numbers));

        if(isSumPositive(numbers)){
            System.out.println("The sum of the first five elements is " + calcNumbersSum(numbers));
        } else {
            System.out.println("The product of the last five elements is " + calcNumbersProduct(numbers));
        }
    }
}
