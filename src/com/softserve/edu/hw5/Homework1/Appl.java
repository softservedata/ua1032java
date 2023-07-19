package com.softserve.edu.hw5.Homework1;

import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MonthDaysCalculator monthDays = new MonthDaysCalculator();
        ElementCalculator elementcalc = new ElementCalculator();
        ArrayOperations arrayOperations = new ArrayOperations();

        boolean bool = true;
        do {
            System.out.print(" 1 - MonthDaysCalculator " +
                "\n 2 - ElementCalculator " +
                "\n 3 - ArrayOperations " +
                "\n Write number: ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    int days = monthDays.numOfMonth();
                    if (days == 0)
                        System.out.println("You have written unexistent number of month");
                    else
                        System.out.println("Number of chosen month days is: " + days);
                    break;
                case 2:
                    System.out.print("Mult or sum of elements: " + elementcalc.calcElements());
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
                    bool = false;
            }
        }while (bool != true);



    }
}
