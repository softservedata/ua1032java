package com.softserve.homework.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework04_02 {
    // TODO: Input three integer numbers and and output the maximum and minimum values of them to the console.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number1;
        int number2;
        int number3;

        System.out.println("Enter first number: ");
        number1 = Integer.parseInt(br.readLine());
        System.out.println("Enter second number: ");
        number2 = Integer.parseInt(br.readLine());
        System.out.println("Enter third number: ");
        number3 = Integer.parseInt(br.readLine());

        if(number1 <= number2 && number1 <= number3){
            if(number2 >= number3){
                System.out.println("Maximum value is " + number2);
            } else {
                System.out.println("Maximum value is " + number3);
            }
            System.out.println("Minimum value is " + number1);
        }

        if(number2 <= number1 && number2 <= number3){
            if(number1 >= number3){
                System.out.println("Maximum value is " + number1);
            } else {
                System.out.println("Maximum value is " + number3);
            }
            System.out.println("Minimum value is " + number2);
        }

        if(number3 <= number2 && number3 <= number1){
            if(number2 >= number1){
                System.out.println("Maximum value is " + number2);
            } else {
                System.out.println("Maximum value is " + number1);
            }
            System.out.println("Minimum value is " + number3);
        }
    }
}
