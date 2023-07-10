package com.softserve.practical.practical5;

import java.util.Arrays;
import java.util.Scanner;

public class Practical05_01 {
    // TODO: Write a Java program that performs the following tasks and outputs the results:
    //      - Create a string array and sort it.
    //      - Create an array with 5 elements and calculate the average value
    //      - Check if the array (any of the previous ones) contains the value ( value enter from the console).
    //      Output the result of the search.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = {"banana", "milk", "sausage", "bread"};
        double[] numbers = {5.23, 4.34, 6.54, 3.12, 21.0}; // 8.046
        double avg = 0.0;
        double findValue;

        System.out.println("Actual array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        //
        for(double number: numbers){
            avg += number;
        }
        avg /= 5;
        System.out.println("\nActual numbers array: " + Arrays.toString(numbers));
        System.out.println("Average value is: " + String.format("%.3f", avg));
        //
        Arrays.sort(numbers);
        System.out.println("\nActual numbers array: " + Arrays.toString(numbers));
        System.out.print("Enter searchable value: ");
        findValue = Double.parseDouble(sc.nextLine());



        int valuePos = Arrays.binarySearch(numbers, findValue);
        if(valuePos != -1) {
            System.out.println("Your value was found on the position " + valuePos);
        } else {
            System.out.println("Your number wasn't found in the array.");
        }
    }
}
