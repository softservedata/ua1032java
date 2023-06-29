package com.softserve.hw03.Task01;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers ");
        float a = sc.nextFloat();
        System.out.println("a = " + a);
        float b = sc.nextFloat();
        System.out.println("b = " + b);
        float c = sc.nextFloat();
        System.out.println("c = " + c);
        if(a >= -5 && a <= 5){
            System.out.println("a belongs to the range");
        } else {
            System.out.println("a out of range");
        }
        if(b >= -5 && b <= 5){
            System.out.println("b belongs to the range");
        } else {
            System.out.println("b out of range");
        }
        if(c >= -5 && c <= 5){
            System.out.println("c belongs to the range");
        } else {
            System.out.println("c out of range");
        }
    }
}
