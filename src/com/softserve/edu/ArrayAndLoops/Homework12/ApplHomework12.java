package com.softserve.edu.ArrayAndLoops.Homework12;

import java.util.Scanner;

public class ApplHomework12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MonthDaysCalculator monthDays = new MonthDaysCalculator();
        ElementCalculator elementCalc = new ElementCalculator();
        ArrayOperations arrayOperations = new ArrayOperations();

        System.out.print(" 1 - MonthDaysCalculator " +
                "\n 2 - ElementCalculator " +
                "\n 3 - ArrayOperations " +
                "\n Write number: ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                monthDays.input();
                int days = monthDays.numOfMonth();
                if (days == 0)
                    System.out.println("You have written unexistent number of month");
                else
                    System.out.println("Number of chosen month days is: " + days);
                break;
            case 2:
                elementCalc.input();
                System.out.println("Mult or sum of elements: " + elementCalc.calcElements());
                break;
            case 3:
                arrayOperations.input();
                int posnum = arrayOperations.findPositiveNum();
                if (posnum != 1000) {
                    System.out.println("Second positive number is: " + posnum);
                }
                System.out.println("min number is: " + arrayOperations.findMinNum());
                System.out.println("Even numbers are: " + arrayOperations.calculateEvenNum());
                break;
            default:
                System.out.println("Write another number");
        }
        sc.close();



    }
}
