package com.softserve.hw.Lesson2;

import java.util.Scanner;

public class TaskOne {
    public static double calculateTheArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Side 1: ");
        double sideA=sc.nextDouble();
        System.out.println("Input Side 2: ");
        double sideB=sc.nextDouble();
        System.out.println("Input Side 3: ");
        double sideC=sc.nextDouble();
        double P=(1/2.0)*(sideA+sideB+sideC);
        return Math.sqrt(P*(P-sideA)*(P-sideB)*(P-sideC));
    }
}
