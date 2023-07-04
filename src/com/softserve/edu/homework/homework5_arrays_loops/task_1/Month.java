package com.softserve.edu.homework.homework5_arrays_loops.task_1;

import java.util.Scanner;
public class Month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int recalculationMonth = 0;
        int monthDays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        System.out.print("Enter a month number  :  ");
        int a = Integer.parseInt(input.nextLine());

        for (int i = 0; i < monthDays.length; i++ ){
            recalculationMonth ++;
            if (recalculationMonth == a){
                System.out.println("This month has "+monthDays[i]+" days.");
                break;
            }
        }
    }
}