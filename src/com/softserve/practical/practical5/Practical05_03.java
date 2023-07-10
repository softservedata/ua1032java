package com.softserve.practical.practical5;

import java.util.Arrays;
import java.util.Random;

public class Practical05_03 {
    // TODO: Create an array of ten random integers using a random number generator. Output:
    //      - the biggest number in the array;
    //      - the sum of positive numbers;
    //      - count the number of negative numbers.
    //      - determine whether there are more negative or positive values in the array. If there are
    //      more negative values, output "There are more negative values in the array." Otherwise,
    //      output "There are more positive values in the array." If the counts are equal, output
    //      "There are an equal number of positive and negative values in the array.

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        int lowerBound = -100;
        int upperBound = 100;
        int maxValue = numbers[0];
        int sumOfPositiveNumbers = 0;
        int quantityOfNegativeNumbers = 0;
        int quantityOfPositiveNumbers = 0;

        for(int i = 0; i < 10; i++){
            numbers[i] = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        }

        System.out.println("Generated array of integers: " + Arrays.toString(numbers));


        for(int i = 1; i < numbers.length; i++){
            if(maxValue < numbers[i]){
                maxValue = numbers[i];
            }
        }
        System.out.println("The biggest number in the array is " + maxValue);
        //
        for(int number: numbers){
            if(number >= 0){
                sumOfPositiveNumbers += number;
            }
        }
        System.out.println("The sum of positive number is " + sumOfPositiveNumbers);
        //
        for(int number: numbers){
            if(number < 0){
                quantityOfNegativeNumbers++;
            }
        }
        System.out.println("Quantity of negative numbers in the array is " + quantityOfNegativeNumbers);
        //
        for(int number: numbers){
            if(number >= 0){
                quantityOfPositiveNumbers++;
            }
        }
        //
        if(quantityOfNegativeNumbers < quantityOfPositiveNumbers) {
            System.out.println("There are more positive values in the array.");
        } else if(quantityOfNegativeNumbers > quantityOfPositiveNumbers) {
            System.out.println("There are more negative values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }
    }
}
