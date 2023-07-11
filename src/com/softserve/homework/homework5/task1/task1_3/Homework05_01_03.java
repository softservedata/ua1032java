package com.softserve.homework.homework5.task1.task1_3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework05_01_03 {
    // TODO: Create a program (in different java documents) that prompts the user to enter:
    //      - 5 integer numbers and find:
    //      position of second positive number;
    //      minimum value and its position in the array.
    //      calculate the product of all entered even numbers (exclude 0 from even if entered by
    //      user).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        int[] numbers = new int[5];

        System.out.println("Enter 5 integer numbers: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Entered numbers: " + Arrays.toString(numbers));
        calc.setNumbers(numbers);
        //
        if(calc.getPosOfSecondPositiveNum() == -1){
            System.out.println("There aren't any numbers in the array that fits the condition!");
        } else{
            System.out.println("Position of second positive number is " + calc.getPosOfSecondPositiveNum());
        }
        //
        System.out.println("Minimum values is " + calc.getMinimumValue() + " and it's placed on position "
                + calc.getMinimumValueI());
        //
        System.out.println("The product of all entered even numbers is " + calc.getProductOfEvenNumbers());
    }
}
