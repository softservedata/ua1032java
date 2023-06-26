package com.softserve.homework01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homeworkTask1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input bed radius:");
        double radius = Double.parseDouble(br.readLine());
        double area = 3.14 * (radius * radius);
        System.out.println("Area = " + area);
        double perimeter = 2 * radius * 3.14;
        System.out.println("Perimeter = " + perimeter);





    }
}
