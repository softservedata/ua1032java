package com.softserve.homework.hw05.task1_2;
/*
10 integers numbers and calculates the sum of the first five elements if they are positive,
or the product of the last five elements if they are not and output the result.
 */

import java.util.Arrays;
import java.util.Scanner;

public class SumPositive {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int[] arr = new int[10];

        System.out.println( "Enter 10 integer numbers:" );
        for (int i = 0; i < 10; i++) {
            System.out.print( "Number " + (i + 1) + ": " );
            arr[i] = sc.nextInt( );
        }
        System.out.println( "Array: " + Arrays.toString( arr ) );

        int sum = 0;
        int product = 1;
        int elementsCount = 0;


        for (int i = 0; i < arr.length; i++) {
            if ( elementsCount < 5 ) {
                if ( arr[i] > 0 ) {
                    sum = sum + arr[i];
                    elementsCount++;
                }
            } else {
                //if (arr[i] <= 0) {
                // не вистачало іфа,тому щоб у тебе рахувався добуток не тільки останніх 5 елементів, а всіх, що були менші за 0
                product = product * arr[i];
            //}
            }
        }
        if ( elementsCount == 5 ) {
            System.out.println( "The sum of the first five elements is: " + sum );
        } else {
            System.out.println( "The product of the last five elements is: " + product );
        }
    }
}




