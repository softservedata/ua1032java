package com.softserve.practical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practical01_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
            TODO: In main() method write code for solving next tasks:
                  1. Define integer variables a and b. Read values a and b from Console and calculate:
                    a + b
                    a - b
                    a * b
                    a / b
                  Output obtained results;
         */
        int a, b;
        System.out.println("Enter value of a:");
        a = Integer.parseInt(br.readLine());
        System.out.println("Enter value of b:");
        b = Integer.parseInt(br.readLine());

        System.out.println("Results:\na + b = " + (a+b) + "\na - b = " + (a-b) + "\na * b = " + (a*b) + "\na / b = " + (a/b));
    }
}