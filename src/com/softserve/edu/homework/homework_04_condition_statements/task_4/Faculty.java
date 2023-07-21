package com.softserve.edu.homework.homework_04_condition_statements.task_4;
import java.util.Scanner;
public class Faculty {
    private int studentsNum;
    private String faculty;

    public Faculty() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter specialty of students  :  ");
        this.faculty = input.nextLine();
        System.out.println("Enter the number of students in this faculty  :  ");
        this.studentsNum = input.nextInt();
    }
    public String toString() {
        return "{  Faculty  :  " + faculty + " ;   Amount of students  :  " + studentsNum  + "  }";
    }
}

