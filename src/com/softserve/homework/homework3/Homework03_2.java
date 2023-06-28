package com.softserve.homework.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework03_2 {
    // TODO: Write Java console application with method to find the smallest number among three integer numbers.

    public static int getSmallestNumber(Object... numbers) {
        int temp = (int) numbers[0];

        for(Object number: numbers){
            if((int) number < temp) temp = (int) number;
        }

        return temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number1;
        int number2;
        int number3;

        System.out.print("Input the first number: ");
        number1 = Integer.parseInt(br.readLine());
        System.out.print("Input the second number: ");
        number2 = Integer.parseInt(br.readLine());
        System.out.print("Input the third number: ");
        number3 = Integer.parseInt(br.readLine());

        System.out.print("The smallest number is " + getSmallestNumber(number1, number2, number3));
    }
}
