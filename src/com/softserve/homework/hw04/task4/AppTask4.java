package com.softserve.homework.hw04.task4;

import java.util.Scanner;

public class AppTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ask to input faculty
        Faculty faculty = new Faculty();
        Faculty.inputFaculty(faculty);

        //output faculty
        Faculty.outputFaculty(faculty);

        //get current season and output
        Season currentSeason = CurrentSeason.getCurrentSeason();
        System.out.println("Current season: " + currentSeason);
    }
}
