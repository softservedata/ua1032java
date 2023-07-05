package com.softserve.homework.hw02;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double c1, c2, c3;
        double t1, t2, t3;
        double c11, c22, c33;
        System.out.println("Input costs per minute");
        System.out.print("cost 1: ");
        c1 = sc.nextDouble();
        System.out.print("cost 2: ");
        c2 = sc.nextDouble();
        System.out.print("cost 3: ");
        c3 = sc.nextDouble();

        System.out.println("Input duration");
        System.out.print("duration 1: ");
        t1 = sc.nextDouble();
        System.out.print("duration 2: ");
        t2 = sc.nextDouble();
        System.out.print("duration 3: ");
        t3 = sc.nextDouble();

        c11 = c1 * t1;
        c22 = c2 * t2;
        c33 = c3 * t3;
        System.out.println();
        System.out.println("cost of call 1: " + c11);
        System.out.println("cost of call 2: " + c22);
        System.out.println("cost of call 3: " + c33);

        sc.close();
    }
}