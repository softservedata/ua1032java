package com.softserve.practical.practical4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Practical04_01 {
    // TODO: Input three numbers from console. Find out and output result how many of them are
    //      odd.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number1;
        int number2;
        int number3;
        int quantityOfOddNumbers = 0;

        System.out.println("Enter first number:");
        number1 = Integer.parseInt(br.readLine());
        System.out.println("Enter second number:");
        number2 = Integer.parseInt(br.readLine());
        System.out.println("Enter third number:");
        number3 = Integer.parseInt(br.readLine());

        if(number1 % 2 != 0){
            quantityOfOddNumbers++;
            System.out.println(number1 + " is odd.");
        }

        if(number2 % 2 != 0){
            quantityOfOddNumbers++;
            System.out.println(number2 + " is odd.");
        }

        if(number3 % 2 != 0){
            quantityOfOddNumbers++;
            System.out.println(number3 + " is odd.");
        }

        System.out.println("Quantity of odd numbers is " + quantityOfOddNumbers);
    }
}
