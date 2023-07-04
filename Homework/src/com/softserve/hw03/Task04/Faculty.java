package com.softserve.hw03.Task04;

import java.util.Scanner;

public class Faculty {
    private int numberOfStudents;
    public Faculty() {
        this.numberOfStudents = numberOfStudents;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
    public void inputNumberOfStudents(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        setNumberOfStudents(sc.nextInt());
        System.out.println("Number of students = " + getNumberOfStudents());
    }
}
