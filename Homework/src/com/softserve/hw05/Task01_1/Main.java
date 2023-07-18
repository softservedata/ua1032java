package com.softserve.hw05.Task01_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Enter the number of month (1-12): ");
        int numberOfMonth = sc.nextInt();
        if(numberOfMonth >= 1 && numberOfMonth <= 12){
            System.out.println("Number of month = " + numberOfMonth);
            System.out.println("Number of days in this month = " + numberOfDays[numberOfMonth - 1]);
        } else {
            System.out.println("Entered wrong number");
        }
    }

}
