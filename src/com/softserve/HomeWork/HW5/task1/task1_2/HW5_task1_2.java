package com.softserve.HomeWork.HW5.task1.task1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW5_task1_2 {
    public static int[] inputArray()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size1;
        System.out.print("Size of array: ");
        size1 = Integer.parseInt(br.readLine());
        int[] number = new int[size1];

        for(int i = 0; i<size1;i++){
            System.out.print((i+1)+". Element: ");
            number[i] = Integer.parseInt(br.readLine());
        }
        return number;
    }
    public static void print(int[] array){
        System.out.print("[ ");
        for(int i = 0; i< array.length;i++ ){
            System.out.print(array[i]+", ");
        }
        System.out.println("]");
    }
    public static boolean isPositive(int[] array){
        for (int i = 0; i<array.length;i++){
            if (array[i]<0){
                return false;
            }
        }
        return true;
    }
    public static int func(int[] array){
        int answer;
        if (isPositive(array)){
            System.out.println("the number is positive");
            answer = 0;
            for (int i = 0; i<array.length/2;i++){
                answer += array[i];
            }
        }else{
            System.out.println("the number is not positive");
            answer = 1;
            for (int i = array.length/2;i<array.length;i++){
                answer *=array[i];
            }
        }
        return answer;
    }

    public static void main(String[] args)throws IOException {
        int[] array = inputArray();
        int answer;
        answer = func(array);
        System.out.println("Answer: " + answer);
    }
}
