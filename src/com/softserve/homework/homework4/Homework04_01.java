package com.softserve.homework.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework04_01 {
    // TODO: Input three float numbers and check: are they all belong to the range [-5, 5].

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float number1;
        float number2;
        float number3;

        System.out.println("Enter first number: ");
        number1 = Float.parseFloat(br.readLine());
        System.out.println("Enter second number: ");
        number2 = Float.parseFloat(br.readLine());
        System.out.println("Enter third number: ");
        number3 = Float.parseFloat(br.readLine());

        if(number1 <= 5 && number1 >= -5){
            System.out.println("First number " + number1 + " belongs to the range [-5,5]");
        } else {
            System.out.println("First number " + number1 + " doesn't belong to the range [-5,5]");
        }
        if(number2 <= 5 && number2 >= -5){
            System.out.println("Second number " + number2 + " belongs to the range [-5,5]");
        } else {
            System.out.println("Second number " + number2 + " doesn't belong to the range [-5,5]");
        }
        if(number3 <= 5 && number3 >= -5){
            System.out.println("Third number " + number3 + " belongs to the range [-5,5]");
        } else {
            System.out.println("Third number " + number3 + " doesn't belong to the range [-5,5]");
        }
    }
}
