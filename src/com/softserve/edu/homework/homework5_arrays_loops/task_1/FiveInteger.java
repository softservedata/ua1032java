package com.softserve.edu.homework.homework5_arrays_loops.task_1;

import java.util.Scanner;
public class FiveInteger {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);

        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter the number [ " + (i + 1) + " ] in turn :");
            arr[i] = Integer.parseInt(input.nextLine());
        }
        ///////////////////
        int position = 0;
        int r = 0;
        for (int i = 0; i < arr.length; i++) {
            r ++;
            if (arr[i] > 0) {
                position ++;
            }
            if(position == 2){
                break;
            }
        }
        System.out.println("The second positive value is in the " + r + " position");
        ////////////////////
        int min = arr[0];
        for (int i = 0; i < arr.length; i++ ){
            if (arr[i] < min ) {
                min = arr[i];
            }
        }
        System.out.println("Minimum value : " + min);
        ////////////////////
        int sum = 1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]==0) {
                arr[i] = 1;
            }
            if (arr[i]%2==0) {
              sum *= arr[i];
            }
        }
        System.out.println("Product of even numbers : " + sum);
    }
}
