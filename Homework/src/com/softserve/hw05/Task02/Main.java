package com.softserve.hw05.Task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int sum = 0;
        int answer = 0;
        do{
            System.out.print("Input a: ");
            a = sc.nextInt();
            System.out.print("Input b: ");
            b = sc.nextInt();
            sum = a + b;
            System.out.println("Sum a + b = " + sum);
            System.out.println("Do you want to calculate again? (1 - yes/2 - no) ");
            answer = sc.nextInt();
        }while(answer != 2);
        sc.close();
    }
}
