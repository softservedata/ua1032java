package com.softserve.homework.homework5.task1.task1_2;

import java.util.Arrays;
import java.util.Scanner;

public class Homework05_01_02 {
    // TODO: Create a program (in different java documents) that prompts the user to enter:
    //      - 10 integers numbers and calculates the sum of the first five elements if they are
    //      positive, or the product of the last five elements if they are not and output the result.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc;
        int[] numbers = new int[10];

        System.out.println("Enter 10 integer numbers: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Entered numbers: " + Arrays.toString(numbers));
        calc = new Calculator(numbers);

        if(calc.isSumPositive()){
            System.out.println("The sum of the first five elements is " + calc.getResult());
        } else {
            System.out.println("The product of the last five elements is " + calc.getResult());
        }
    }
}
