package com.softserve.edu01.practical;
import java.util.Scanner;
public class Pt1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();

        int result = (num1 + num2 + num3) / 3;
        System.out.println("Your result: " + result);

        sc.close();
    }
}
