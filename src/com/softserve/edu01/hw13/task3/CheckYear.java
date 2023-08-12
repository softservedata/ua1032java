package com.softserve.edu01.hw13.task3;

import java.util.Scanner;

public class CheckYear {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter year to checking it for leap");
        int year = scanner.nextInt();

        if (CheckingYear(year)) {
            System.out.println(year + " is leap");
        } else {
            System.out.println(year + " isn't leap");
        }
    }
    public static boolean CheckingYear(int year) {
        for (int i = 0; i < (year); i++) {
            if (((year) % 4) != 0) {
                return false;
            }
        }
        return true;
    }
}
