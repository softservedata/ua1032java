package com.softserve.homework.hw05.task1_3;
/*
5 integer numbers and find:
position of second positive number;
minimum value and its position in the array.
calculate the product of all entered even numbers (exclude 0 from even if entered by user).

 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] arr = new int[5];

            System.out.println("Enter 5 integer numbers:");
            for (int i = 0; i < 5; i++) {
                System.out.print( "Number " + (i + 1) + ": " );
                arr[i] = scanner.nextInt();
            }
        System.out.println( "Array: " + Arrays.toString( arr ) ); 
            
            
            int secondPositivePosition = -1;
            int elementsCount = 0;
            for (int i = 0; i < 5; i++) {
                if (arr[i] > 0) {
                    elementsCount++;
                    if (elementsCount == 2) {
                        secondPositivePosition = i;
                        break;
                    }
                }
            }

            int minValue = arr[0];
            int minPosition = 0;
            for (int i = 1; i < 5; i++) {
                if (arr[i] < minValue) {
                    minValue = arr[i];
                    minPosition = i;
                }
            }

            int product = 1;
            for (int i = 0; i < 5; i++) {
                if (arr[i] != 0 && arr[i] % 2 == 0) {
                    product = product * arr[i];
                }
            }

            System.out.println("Position of the second positive number: " + secondPositivePosition);
            System.out.println("Minimum value: " + minValue);
            System.out.println("Position of the minimum value: " + minPosition);
            System.out.println("Product of all entered even numbers: " + product);
    }
}
