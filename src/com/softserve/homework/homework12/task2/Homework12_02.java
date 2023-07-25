package com.softserve.homework.homework12.task2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework12_02 {
    // TODO: Create a method readNumber(int start, int end), that read from console integer number
    //      and return it, if it is in the range [start...end]. If an invalid number or non-number text is
    //      read, the method should throw an exception.
    //      Using this method write a method main(), that must enter 10 numbers:
    //      a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100

    public static int readNumber(int start, int end) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ", start, end);

        try {
            int number = sc.nextInt();
            if(number > start && number < end) return number;
            else throw new IllegalArgumentException("Number is out of range!");
        } catch(InputMismatchException e){
            System.out.println("\tError: Invalid value!");
            return -1;
        } catch (IllegalArgumentException e){
            System.out.println("\tError: " + e.getMessage());
            return -2;
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = readNumber(i + 2, 100);
        }

        System.out.println("Entered numbers: " + Arrays.toString(numbers));
    }
}