package com.softserve.edu.homework.homework03_oop_introduction.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {

    public static void main (String[] args) throws IOException {

        BufferedReader least = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Input the first number : ");
        double a = Double.parseDouble(least.readLine());

        System.out.print("Input the second number : ");
        double b = Double.parseDouble(least.readLine());

        System.out.print("Input the third number : ");
        double c = Double.parseDouble(least.readLine());

        if(a > b && a > c) {
            System.out.println("the largest number is : " + a);
        }
        else if (b > a && b > c){
            System.out.println("the largest number is : " + b);
        }
        else if (c > a && c > b){
            System.out.println("the largest number is : " + c);
        }
        else {System.out.println("all numbers are equal");
        }
    }
}

