package com.softserve.edu.practical.Practical_tasks_2_oop_introduction.Task_1;

import java.io.IOException;
import java.util.Scanner;
public class Task_1 {
    static double getTotal(int numberA, int numberB){
        int sum = (numberA+numberB);
        System.out.println(" Total  : " + sum );
        return 0;
    }
    static double getAverage (int numberA, int numberB) {
        double Average = (numberA + numberB) / 2;
        System.out.println(" Average  : " + Average);
        return 0;
    }
    public static int getNumber (String str){return Integer.parseInt(str.replaceAll("\\D", ""));}
    public static void main (String args[]) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number(string type)  : ");
        String a = in.nextLine();
        System.out.println("Enter the second number(string type)  : ");
        String b = in.nextLine();

        int numberA = getNumber(a);
        System.out.println(" conversion from string to int of the first number  : " + numberA);
        int numberB = getNumber(b);
        System.out.println(" conversion from string to int of the second number  : " + numberB);
        getTotal(numberA,numberB);
        getAverage(numberA,numberB);
    }
}
