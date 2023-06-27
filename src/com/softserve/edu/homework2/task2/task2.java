package com.softserve.edu.homework2.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {

    public static void main (String[] args) throws IOException {

        BufferedReader least = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Input the first number : ");
        double a = Integer.parseInt(least.readLine());

        System.out.print("Input the second number : ");
        double b = Integer.parseInt(least.readLine());

        System.out.print("Input the third number : ");
        double c = Integer.parseInt(least.readLine());

        if(a > b && a > c) {
            System.out.println("The smallest number is : " + a);
        }
        else if (b > a && b > c){
            System.out.println("The smallest number is : " + b);
        }
        else if (c > a && c > b){
            System.out.println("The smallest number is : " + c);
        }
        else {System.out.println("all numbers are equal");
        }
    }
}

