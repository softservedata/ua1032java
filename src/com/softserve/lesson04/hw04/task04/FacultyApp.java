package com.softserve.lesson04.hw04.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacultyApp {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of students on faculty: ");
        int studentNum = Integer.parseInt(bufferedReader.readLine());
        Faculty faculty = new Faculty(studentNum, CurrentSeason.AUTUMN);
        System.out.println("Number of students on faculty: " + faculty.getStudentNum());
        System.out.println("Name of current season: " + faculty.getCurrentSeason().getName());
    }
}
