package com.softserve.hw12.Task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter two numbers: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            System.out.println(div(a, b));
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public static double div(double a, double b){
            if(a == 0 || b == 0){
                throw new ArithmeticException("The number cannot be zero");
        }
            return a / b;
    }
}
