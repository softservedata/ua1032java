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
                System.out.println("Monday" + "\n" + "��������");
                break;
            case 2:
                System.out.println("Tuesday" + "\n" + "³������");
                break;
            case 3:
                System.out.println("Wednesday" + "\n" +  "������");
                break;
            case 4:
                System.out.println("Thursday" + "\n" + "������");
                break;
            case 5:
                System.out.println("Friday" + "\n" + "�'������");
                break;
            case 6:
                System.out.println("Saturday" + "\n" + "������");
                break;
            case 7:
                System.out.println("Sunday" + "\n" + "�����");
                System.out.println("01" );
            default:
                System.out.println("Oooops, something wrong !");
        }
    }
}