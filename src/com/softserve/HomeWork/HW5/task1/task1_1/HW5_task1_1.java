package com.softserve.HomeWork.HW5.task1.task1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW5_task1_1 {
    public static int[] months = {31, 28, 31, 30, 31, 30, 31, 31,30 ,31 ,30 ,31};

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice;
        do {
            System.out.print("Number of the month: ");
            choice = Integer.parseInt(br.readLine());
        }while(choice < 1 || choice > 12);

        //array
        System.out.println("Number of days in a month: "+ months[choice - 1]);

        //Enum
        Month month = Month.getByMonthNumber(choice);
        System.out.println(month);

    }


}
