package com.softserve.practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practical01_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // TODO: Write a program that takes three numbers from console as input to calculate and print output the average of the numbers
        int number1, number2, number3;

        System.out.println("Enter first number:");
        number1 = Integer.parseInt(br.readLine());
        System.out.println("Enter second number:");
        number2 = Integer.parseInt(br.readLine());
        System.out.println("Enter third number:");
        number3 = Integer.parseInt(br.readLine());

        double result = (double) (number1 + number2 + number3) / 3;
        System.out.println("Average is " + result);
    }
}