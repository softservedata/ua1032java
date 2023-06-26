package com.softserve.Practicals.p1.task2;

import java.util.Scanner;

public class TheAverageOf {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input three numbers: ");

        double num1 = Double.parseDouble(sc.next());
        double num2 = Double.parseDouble(sc.next());
        double num3 = Double.parseDouble(sc.next());

        Double result = (num1 + num2 + num3) / 3;

        System.out.println(result);

        sc.close();
    }
}
