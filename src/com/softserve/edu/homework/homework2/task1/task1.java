package com.softserve.edu.homework.homework2.task1;

import java.lang.Math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader area = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Input Side 1 : ");
        double x = Integer.parseInt(area.readLine());

        System.out.print("Input Side 2 : ");
        double y = Integer.parseInt(area.readLine());

        System.out.print("Input Side 3 : ");
        double l = Integer.parseInt(area.readLine());
        double p = 0.5*(x+y+l);
        System.out.println("The area of the triangle is " + Math.sqrt(p*(p-x)*(p-y)*(p-l)) + " м²");
    }
}