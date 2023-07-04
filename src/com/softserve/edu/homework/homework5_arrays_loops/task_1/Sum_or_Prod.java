package com.softserve.edu.homework.homework5_arrays_loops.task_1;

import java.io.IOException;
import java.util.Scanner;

public class Sum_or_Prod {
    public static void main(String[] args) throws IOException {
        boolean flag = false;
        Scanner input = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length ; i++){
            System.out.print("enter the number [ " + (i+1) + " ] in turn :");
            arr[i] = Integer.parseInt(input.nextLine());
        }
        for (int i = 0; i < 5; i++){
            if (arr[i] >= 0) {
                flag = true;
            }
            else{flag = false;
            break;}
        }
        if (flag == true){
            int sum = 0;
            for(int i = 0; i < 5; i++){
                sum += arr[i];
            }
            System.out.println("The sum of the first five values  :  "+ sum);
        }
        else if(flag == false) {
            int product = 1;
            for(int i = 5; i < arr.length; i++){
                if (arr[i] == 0){
                    arr[i] = 1;
                }
                product *= arr[i];
            }
            System.out.println("The product of the last five numbers  :  "+ product);
        }
    }
}