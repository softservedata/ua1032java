package com.softserve.edu.homework.homework_05_arrays_loops.task_1.task_1_3;

import java.util.Scanner;
public class FiveInteger {
    public static int[] InputArr() {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter the number [ " + (i + 1) + " ] in turn :");
            arr[i] = Integer.parseInt(input.nextLine());
        }
        return arr;
    }
    public static int SecondPositiveNumber(int[] arr){
        int position = 0;
        int positive_number = 0;
        for (int i = 0; i < arr.length; i++) {
            position++;
            if (arr[i] >= 0) {
                positive_number++;
            }
            if (positive_number == 2) {
                break;
            }
        }
        return position;
    }
    public static int MinimalValue (int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length ; i++ ){
            if (arr[i] < min ) {
                min = arr[i];
            }
        }
        return min;
  }
    public static int ProductEvenNumber(int[] arr){
        int prod_even_number = 1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i]==0) {
                arr[i] = 1;
            }
            if (arr[i]%2==0) {
                prod_even_number *= arr[i];
            }
        }
        return prod_even_number;
    }
    public static void Print(int [] arr) {
        System.out.print("Array : ");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
}

