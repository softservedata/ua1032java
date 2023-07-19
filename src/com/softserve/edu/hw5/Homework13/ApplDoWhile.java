package com.softserve.edu.hw5.Homework13;

import java.util.Scanner;

public class ApplDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answ1;
        do{
            System.out.print("a = ");
            int a = scan.nextInt();
            System.out.print("b = ");
            int b = scan.nextInt();
            System.out.println("a + b = " + a + b);
            scan.nextLine();
            System.out.print("You want to perform the operation again? " +
                    "\nThe answer should be 'yes', or 'no': ");

            answ1 = scan.nextLine().toLowerCase();

        }while(answ1.equals("yes")); // the program will run until answ1 is no or some other value.
        scan.close();
    }
}
