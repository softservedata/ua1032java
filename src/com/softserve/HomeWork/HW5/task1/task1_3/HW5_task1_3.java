package com.softserve.HomeWork.HW5.task1.task1_3;

import com.softserve.HomeWork.HW5.task1.task1_2.HW5_task1_2;

import java.io.IOException;

public class HW5_task1_3 {
    public static void main(String[] args)throws IOException {

        int[] array = HW5_task1_2.inputArray();
        int positiveNumber = 0;
        //------------------------------------------------
        for (int i = 0; i<array.length;i++){
            if(array[i]>=0) {
                positiveNumber++;
            }
            if (positiveNumber == 2){
                System.out.println("Number: "+ array[i]);
                System.out.println("Position: " + i+1 );
                break;
            }
        }
        //------------------------------------------------
        int min = array[0];
        int index = 0;
        for (int i = 0 ; i < array.length; i++){
            if (array[i] <min){
                min = array[i];
                index = i;
            }
        }
        System.out.println("Minimal element: ");
        System.out.println("Index: ");
        //------------------------------------------------
        int product = 1;
        for (int i = 0; i<array.length;i++){
            if (array[i]%2== 0 && array[i] !=0){
                product *= array[i];
            }
        }
        System.out.println("The product of all entered even numbers: "+ product);

        HW5_task1_2.print(array);
    }
}
