package com.softserve.hw04.Task02;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        System.out.println("a = " + a);
        int b = sc.nextInt();
        System.out.println("b = " + b);
        int c = sc.nextInt();
        System.out.println("c = " + c);
        int maxValue = Math.max(Math.max(a,b),c);
        int minValue = Math.min(Math.min(a,b),c);
        System.out.println("max value = " + maxValue);
        System.out.println("min value = " + minValue);
    }

}
