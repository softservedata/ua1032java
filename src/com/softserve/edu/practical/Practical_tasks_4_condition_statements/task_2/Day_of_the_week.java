package com.softserve.edu.practical.Practical_tasks_4_condition_statements.task_2;
import java.io.IOException;
import java.util.Scanner;
public class Day_of_the_week {
    public static void main(String[] args) throws  IOException{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the day of the week : ");
        int day_of_the_week = Integer.parseInt(input.nextLine());

        String day_in_English;
        String day_in_Ukrainian;

        switch (day_of_the_week) {
            case 1 -> {
                day_in_English = "Monday";
            }
            case 2 -> {
                day_in_English = "Tuesday";

            }
            case 3 -> {
                day_in_English = "Wednesday";

            }
            case 4 -> {
                day_in_English = "Thursday";

            }
            case 5 -> {
                day_in_English = "Friday";

            }
            case 6 -> {
                day_in_English = "Saturday";

            }
            case 7 -> {
                day_in_English = "Sunday";

            }
            default -> {
                System.out.println("Invalid day number entered!");
                return;
            }
        }
        switch (day_of_the_week) {
            case 1 -> {
                day_in_Ukrainian = "Понеділок";

            }
            case 2 -> {
                day_in_Ukrainian = "Вівторок";

            }
            case 3 -> {
                day_in_Ukrainian = "Середа";
            }
            case 4 -> {
                day_in_Ukrainian = "Четвер";
            }
            case 5 -> {
                day_in_Ukrainian = "П'ятниця";
            }
            case 6 -> {
                day_in_Ukrainian = "Субота";
            }
            case 7 -> {
                day_in_Ukrainian = "Неділя";
            }
            default -> {
                System.out.println("Invalid day number entered!");
                return;
            }
        }
        System.out.println("Day of the week in English : "+day_in_English);
        System.out.println("День тижня українською мовою : "+day_in_Ukrainian);

    }
}
