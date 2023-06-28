package com.softserve.edu01.hw3;

import java.util.Scanner;

public class HW3_2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Your first num: ");
        int a = num.nextInt();
        System.out.print("Your second num: ");
        int b = num.nextInt();
        System.out.print("Your third num: ");
        int c = num.nextInt();

        int min = min( a, b, c);
        System.out.println("The less of number's: " + min);

    }

    public static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
