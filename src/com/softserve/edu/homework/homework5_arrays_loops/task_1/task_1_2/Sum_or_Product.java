package com.softserve.edu.homework.homework5_arrays_loops.task_1.task_1_2;

import java.util.Scanner;

public class Sum_or_Product {

    public static int[] InputArr(){
        Scanner input = new Scanner(System.in);
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            System.out.print("enter the number [ " + (i + 1) + " ] in turn :");
            number[i] = Integer.parseInt(input.nextLine());
        }
        return number;
    }
    public static boolean NumberPositive(int[] number) {
        for (int i = 0; i < 5; i++) {
            if (number[i] < 0) {
                return false;
            }
        }
        return true;
    }
    public static int Sum_or_Prod(int[] number) {
        int result;
        if (NumberPositive(number)) {
            result = 0;
            for (int i = 0; i < 5; i++) {
                result += number[i];
            }
        } else{
            result = 1;
            for (int i = 5; i < 10; i++) {
                if(number[i] == 0){
                    number[i] = 1;
                }
                result *= number[i];
            }
        }
        return result;
    }
    public static void Print(int [] number) {
        System.out.print("Array : ");
        for (int i : number) {
            System.out.print(i + ", ");
        }
    }
}