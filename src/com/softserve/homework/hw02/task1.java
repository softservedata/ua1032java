package com.softserve.homework.hw02;

import java.util.Scanner;
import static java.lang.Math.PI;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        double perimeter= 2*PI*radius;
        double area = 2*PI*radius*radius;
        System.out.println("Perimeter of flower bed = "+ perimeter);
        System.out.println("Area of flower bed = "+ area);
    }
}