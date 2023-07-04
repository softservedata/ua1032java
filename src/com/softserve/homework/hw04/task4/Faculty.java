package com.softserve.homework.hw04.task4;

import java.util.Scanner;

/*
Create a class called Faculty and input the information about the number of students (using the console)
and the current season (using enum).
Each season must have a name in English (use the constructor).
In main() method, check the correct operation of the code.
 */
// Faculty class
class Faculty {
    final private int numberOfStudents;
    final private Season currentSeason;

    public int getNumberOfStudents () {
        return numberOfStudents;
    }
    public Season getCurrentSeason () {
        return currentSeason;
    }
    public Faculty ( int numberOfStudents, Season currentSeason ) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        System.out.print("Enter the current season index (0 - SPRING, 1 - SUMMER, 2 - AUTUMN, 3 - WINTER): ");
        int seasonIndex = sc.nextInt();

        Season currentSeason = Season.values()[seasonIndex];

        Faculty faculty = new Faculty(numberOfStudents, currentSeason);

        System.out.println("Faculty Details:");
        System.out.println("Number of students: " + faculty.getNumberOfStudents());
        System.out.println("Current season: " + faculty.getCurrentSeason());

        sc.close();
    }

}
