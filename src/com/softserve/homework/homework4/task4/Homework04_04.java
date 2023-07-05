package com.softserve.homework.homework4.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework04_04 {
    // TODO: Create a class called Faculty and input the information about the number of students (using
    //      the console) and the current season (using enum). Each season must have a name in English
    //      (use the constructor). In main() method, check the correct operation of the code.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int quantityOfStudents;
        Season season;
        Faculty faculty;

        System.out.println("Enter quantity of the students: ");
        quantityOfStudents = Integer.parseInt(br.readLine());
        System.out.println("Enter current season (winter, spring, summer, autumn): ");
        season = Season.valueOf(br.readLine().toUpperCase());

        faculty = new Faculty(quantityOfStudents, season);

        System.out.println(faculty);
    }
}
