package com.softserve.practicals.p4.task2;
/*
Input from the console the number of the day of the week. Output the name in two languages.
 */

import java.util.Scanner;

public class TextInTwolanguages {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the day of the week:");
        int dayNumber = sc.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Monday" + "\n" + "Понеділок");
                break;
            case 2:
                System.out.println("Tuesday" + "\n" + "Вівторок");
                break;
            case 3:
                System.out.println("Wednesday" + "\n" +  "Середа");
                break;
            case 4:
                System.out.println("Thursday" + "\n" + "Четвер");
                break;
            case 5:
                System.out.println("Friday" + "\n" + "П'ятниця");
                break;
            case 6:
                System.out.println("Saturday" + "\n" + "Субота");
                break;
            case 7:
                System.out.println("Sunday" + "\n" + "Неділя");
                System.out.println("01" );
            default:
                System.out.println("Oooops, something wrong !");
        }
    }
}