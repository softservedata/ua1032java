package com.softserve.Homework.hw_4.Task4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of students: ");
        int numberOfStudents = Integer.parseInt(reader.readLine());

        Faculty faculty = new Faculty(numberOfStudents, Season.Autumn);
        System.out.println("Number of students: " + faculty.getNumberOfStudents());
        System.out.println("Current season: " + faculty.getCurrentSeason().getName());
    }
}