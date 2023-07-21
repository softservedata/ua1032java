package com.softserve.edu.homework.homework_09_Collections.task_2;

import java.util.*;
import java.util.Scanner;
public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades;

    public Student(String name, String group, int course, Map<String, Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }
    public String getName() {
        return name;
    }
    public int getCourse() {
        return course;
    }
    @Override
    public String toString() {
        return "Student - [ Name : " + name + ";  Group : " + group + ";  Course : " + course + ";  Grades : " + grades + " ]";
    }
    public double getAverageGrade() {
        double gpa = 0;
        for (int grade : grades.values()) {
            gpa += grade;
        }
        return gpa / grades.size();
    }
    public boolean isPromoted() {
        double averageGrade = getAverageGrade();
        if (averageGrade >= 3.0) {
            course++;
            return true;
        } else {
            return false;
        }
    }
    public static String printStudents(List<Student> studentCollection) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter course: ");
        int course_have = Integer.parseInt(input.nextLine());
        StringBuilder wishCourse = new StringBuilder();
        for (Student student : studentCollection) {
            if (student.getCourse() == course_have) {
                wishCourse.append(student.getName()).append("; ");
            }
        }
        if (wishCourse.length() == 0) {
            wishCourse.append("No students found for the specified course.");
        }
        return wishCourse.toString();
    }
}

