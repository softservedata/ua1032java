package com.softserve.homework.homework5.task1;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Homework05_01_03 {
    // TODO: Create a program (in different java documents) that prompts the user to enter:
    //      - 5 integer numbers and find:
    //      position of second positive number;
    //      minimum value and its position in the array.
    //      calculate the product of all entered even numbers (exclude 0 from even if entered by
    //      user).

    public static int getPosOfSecondPositiveNum(int[] numbers) {
        int posOfSecondPositiveNum = -1;

        for(int i = 0; i < 5; i++){
            if(numbers[i] >= 0 && i != 4){
                if(numbers[i + 1] >= 0){
                    posOfSecondPositiveNum = i + 1;
                    break;
                }
            }
        }

        return posOfSecondPositiveNum;
    }

    public static int getMinimumValue(int[] numbers) {
        int minimumValue = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if(minimumValue > numbers[i]){
                int temp = minimumValue;
                minimumValue = numbers[i];
                numbers[i] = temp;
            }
        }

        return minimumValue;
    }

    public static int getMinimumValueI(int[] numbers){
        int iminimum = 0;
        int minimumValue = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if(minimumValue > numbers[i]){
                int temp = minimumValue;
                minimumValue = numbers[i];
                numbers[i] = temp;
                iminimum = i;
            }
        }

        return iminimum;
    }

    public static int getProductOfEvenNumbers(int[] numbers){
        int product = 1;

        for(int number: numbers){
            if(number != 0 && number % 2 == 0){
                product *= number;
            }
        }

        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        int product = 1;

        System.out.println("Enter 5 integer numbers: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Entered numbers: " + Arrays.toString(numbers));
        //
        if(getPosOfSecondPositiveNum(numbers) == -1){
            System.out.println("There aren't any numbers in the array that fits the condition!");
        } else{
            System.out.println("Position of second positive number is " + getPosOfSecondPositiveNum(numbers));
        }
        //
        System.out.println("Minimum values is " + getMinimumValue(numbers) + " and it's placed on position "
                + getMinimumValueI(numbers));
        //
        System.out.println("The product of all entered even numbers is " + getProductOfEvenNumbers(numbers));
    }
}
