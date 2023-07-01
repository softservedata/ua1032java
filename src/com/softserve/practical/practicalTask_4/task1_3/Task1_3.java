package com.softserve.practical.practicalTask_4.task1_3;

import java.util.Scanner;

public class Task1_3 {
    public static int countOddNumbers() {
        Scanner sc = new Scanner(System.in);
        double one = sc.nextDouble();
        double two = sc.nextDouble();
        double three = sc.nextDouble();
        int count = 0;
        if (one % 2 == 0) {
            count++;
        }
        if (two % 2 == 0) {
            count++;
        }
        if (three % 2 == 0) {
            count++;
        }
        return count;
    }

    public static void withdrawDayWeek() {
        System.out.println("Please input day of week");
        int numberDay = new Scanner(System.in).nextInt();
        switch (numberDay) {
            case 1:
                System.out.println("Sunday - Неділя");
                break;
            case 2:
                System.out.println("Monday - Понеділок");
                break;
            case 3:
                System.out.println("Tuesday - Вівторок");
                break;
            case 4:
                System.out.println("Wednesday - Середа");
                break;
            case 5:
                System.out.println("Thursday - Четеврг");
                break;
            case 6:
                System.out.println("Friday - П'ятниця");
                break;
            case 7:
                System.out.println("Saturday - Субота");
                break;

        }
    }

    public static void seekNameContinent() {
        System.out.println("Please input day of week");
        String country = new Scanner(System.in).nextLine();
        switch (country) {
            case "Ukraine":
                System.out.println("Eurasia");
                break;
            case "Sao Paulo":
                System.out.println("South America");
                break;
            case "Cairo":
                System.out.println("Africa");
                break;

        }
    }
}
