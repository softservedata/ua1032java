package com.softserve.edu01.homeworks;

import java.util.Scanner;

public class Hw1_1 {
    public static void main(String[] args) {
        //P = 2πR
        //S = π * R^2
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleas print radios your circle");
        int R = sc.nextInt();
        double pi = Math.PI;
        double perimeter = 2 * pi * R;
        double area = pi * (R * R);
        System.out.println("There are your circle, perimeter and area: \n"
                + perimeter + " sm\n" + area + " sm²");
    }
}
