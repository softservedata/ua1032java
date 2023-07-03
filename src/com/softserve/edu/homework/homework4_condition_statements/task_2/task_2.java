package com.softserve.edu.homework.homework4_condition_statements.task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_2 {
    private int a;
    private int b;
    private int c;
    public static void main (String[]args)throws IOException {
        BufferedReader mid = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number : ");
        int a = Integer.parseInt(mid.readLine());
        System.out.println("Enter second number : ");
        int b = Integer.parseInt(mid.readLine());
        System.out.println("Enter third number : ");
        int c = Integer.parseInt(mid.readLine());


        if((a > b && a > c) && ( b > c )){
            System.out.println("Maximum value : " + a);
            System.out.println("Minimum value : " + c);
        }
        else if((a > b && a > c) && ( c > b )){
            System.out.println("Maximum value : " + a);
            System.out.println("Minimum value : " + b);
        }
        else if ((b > a && b > c) && ( c > a ) ){
            System.out.println("Maximum value :" + b);
            System.out.println("Minimum value : " + a);
        }
        else if ((b > a && b > c) && ( a > c ) ){
            System.out.println("Maximum value :" + b);
            System.out.println("Minimum value : " + c);
        }
        else if ((c > a && c > b) && (a > b) ){
            System.out.println("Maximum value :" + c);
            System.out.println("Minimum value : " + b);
        }
        else if ((c > a && c > b) && (b > a) ){
            System.out.println("Maximum value :" + c);
            System.out.println("Minimum value : " + a);
        }
        else {System.out.println("ERROR");}
    }
}
