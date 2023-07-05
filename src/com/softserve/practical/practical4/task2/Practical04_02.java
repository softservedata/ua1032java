package com.softserve.practical.practical4.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practical04_02 {
    // TODO: Input from the console the number of the day of the week. Output the name in two
    //  languages.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfDay;
        Week week = null;

        System.out.print("Enter the number of the day of the week (1-7): ");
        numberOfDay = Integer.parseInt(br.readLine());

        switch (numberOfDay){
            case 1:
                week = Week.MONDAY;
                break;
            case 2:
                week = Week.TUESDAY;
                break;
            case 3:
                week = Week.WEDNESDAY;
                break;
            case 4:
                week = Week.THURSDAY;
                break;
            case 5:
                week = Week.FRIDAY;
                break;
            case 6:
                week = Week.SATURDAY;
                break;
            case 7:
                week = Week.SUNDAY;
                break;
            default:
                System.out.println("Invalid day!");
                break;
        }

        System.out.print(week);
    }
}
