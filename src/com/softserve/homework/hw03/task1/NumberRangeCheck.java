package com.softserve.homework.hw03.task1;
/*
Input three float numbers and check: are they all belong to the range [-5, 5].
 */

import java.util.Scanner;

public class NumberRangeCheck {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first float number: ");
        float number1 = sc.nextFloat();
        System.out.print("Enter the second float number: ");
        float number2 = sc.nextFloat();
        System.out.print("Enter the third float number: ");
        float number3 = sc.nextFloat();

        if ( (number1 >= -5 && number1 <= 5) &&
                (number2 >= -5 && number2 <= 5) &&
                (number3 >= -5 && number3 <= 5)){
            System.out.println("All numbers belong to the range [-5, 5].");
        } else {
            System.out.println("At least one number is outside the range [-5, 5].");
        }
        sc.close();
    }
}