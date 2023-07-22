package com.softserve.edu.hw5.Homework13;

import java.util.Scanner;

public class ApplDoWhile {
    public int Sum(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ApplDoWhile applDoWhile = new ApplDoWhile();
        String answ1;
        int a, b, sum;
        do{
            System.out.print("a = ");
            a = scan.nextInt();
            System.out.print("b = ");
            b = scan.nextInt();
            System.out.println("a + b = " + applDoWhile.Sum(a, b));
            scan.nextLine();
            System.out.print("You want to perform the operation again? " +
                    "\nThe answer should be 'yes', or 'no': ");

            answ1 = scan.nextLine().toLowerCase();

        }while(answ1.equals("yes")); // the program will run until answ1 is no or some other value.
        scan.close();
    }
}
