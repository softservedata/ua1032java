package com.softserve.edu01.hw3;

import java.util.Scanner;

public class Hw3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = (a + b + c) / 2;

        double areaNo = triangle(a, b, c, s);
        double area = Math.sqrt(areaNo);
        System.out.println("Площа  трикутника дорівнює: " + area);
    }

    public static double triangle(int a, int b, int c, int s) {
        return s * (s - a) * (s - b) * (s - c);
    }
}