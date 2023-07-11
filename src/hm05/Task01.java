package hm05;

import java.util.Scanner;

public class Task01 {
    public static int[] MonthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int getMonthDays(int MonthNumber){
        return MonthDays[MonthNumber - 1];
    }

    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        int MonthNumber;

        System.out.print("enter a month number:");
        MonthNumber = scanner.nextInt();

        if (MonthNumber >= 1 && MonthNumber <= 12) {
            System.out.println("The number of days in that month is " + getMonthDays(MonthNumber));
        } else {
            System.out.println("Invalid month number! Try again.");

        }
    }
}

