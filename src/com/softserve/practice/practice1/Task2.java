package com.softserve.practice.practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        int a,b,c,d;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("First number = ");
        a = Integer.parseInt(br.readLine());
        System.out.print("Second number = ");
        b = Integer.parseInt(br.readLine());
        System.out.print("Third number = ");
        c = Integer.parseInt(br.readLine());
        d = (a+b+c)/3;
        System.out.println("Average is: " +d);
    }
}
