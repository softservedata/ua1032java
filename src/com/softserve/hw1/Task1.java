package com.softserve.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        double pi = 3.14;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Radius = ");
        double r = Double.parseDouble(br.readLine());
        System.out.println("Square = " +r*r*pi);
        System.out.println("Perimeter = " +2*pi*r);
    }
}