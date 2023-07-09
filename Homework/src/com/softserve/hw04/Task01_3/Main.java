package com.softserve.hw04.Task01_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int [] numbers = {5, -10, 3, 2, 6};
       int min = numbers[0];
       int position = 0;
       int dob = 1;
       int count = 0;
       // find min and its position
       for(int i = 0; i < numbers.length; i++){
           if(numbers[i] > min){
               min = numbers[i];
               position = i;
           }
       }
        System.out.println("Min value: " + min + " position: " + (position + 1));
       // find position of second positive value
       for(int i = 0; i < numbers.length; i++){
           if(numbers[i] > 0){
               count++;
               if(count == 2){
                   position = i;
                   break;
               }
           }
       }
        System.out.println("position of second positive value: " + (position + 1));
       //calculate the product of all entered even numbers
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                dob *= numbers[i];
            }
        }
        System.out.println("Product: " + dob);
    }
}
