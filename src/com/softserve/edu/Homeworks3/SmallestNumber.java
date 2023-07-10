package com.softserve.edu.Homeworks3;

import java.util.Scanner;

public class SmallestNumber {
    public static int FindSmallNum(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        }
        if (b <= a && b <= c) {
            return b;
        }
        if (c <= a && c <= b) {
            return c;
        }
        return 0;
    }

    public static void main(String[] args) {
        int n1, n2, n3;
        /*n1 - first number
          n2 - second number
          n3 - third number*/

        Scanner scan = new Scanner(System.in);
        System.out.print("First number: ");
        n1 = scan.nextInt();
        System.out.print("Second number: ");
        n2 = scan.nextInt();
        System.out.print("Third number: ");
        n3 = scan.nextInt();

        System.out.println("The smallest number of three numbers is: " + FindSmallNum(n1, n2, n3));
        scan.close();
    }

}
