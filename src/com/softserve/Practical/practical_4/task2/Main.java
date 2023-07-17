package com.softserve.Practical.practical_4.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the day of the week (1-7): ");
        int day = scanner.nextInt();
        String[] daysInEnglish = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] daysInUkrainian = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};
        if (day >= 1 && day <= 7) {
            System.out.println("Day of the week in English: " + daysInEnglish[day - 1]);
            System.out.println("Day of the week in Ukrainian: " + daysInUkrainian[day - 1]);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
    }
}

