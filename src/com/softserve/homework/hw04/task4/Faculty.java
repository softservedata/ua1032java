package com.softserve.homework.hw04.task4;

import java.util.Scanner;

public class Faculty {
    private int numberOfStudents;

    public Faculty() {
    }

    public Faculty(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public static int getNumberOfStudents(Faculty faculty) {
        return faculty.numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public static void inputFaculty(Faculty faculty){
        Scanner sc = new Scanner(System.in);

        int numbStudents;
        System.out.println("Input number of students: ");
        numbStudents = sc.nextInt();
        faculty.setNumberOfStudents(numbStudents);
    }

    public static void outputFaculty(Faculty faculty){
        System.out.println("Number of students: "+ getNumberOfStudents(faculty));
    }

    @Override
    public String toString() {
        return "Faculty: numberOfStudents= " + numberOfStudents;
    }
}
