package com.softserve.homework.homework13.task3;

import java.time.Year;
import java.util.Scanner;

public class Homework13_03 {
    // TODO: Create method which take year as a parameter and return true if year is a leap

    public static boolean isLeapYear(int year) {
        return Year.isLeap(year);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.print("Enter year: ");
        year = sc.nextInt();
        System.out.println("Year is leap: " + isLeapYear(year));
        sc.close();//не забувай, бо у таких маленьких аплікаціях проблеми не буде, але у великих може призвести до витоків
    }
}
