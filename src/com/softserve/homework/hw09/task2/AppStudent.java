package com.softserve.homework.hw09.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        //add student1
        List<Integer> student1Grades = new ArrayList<>();
        student1Grades.add(5);
        student1Grades.add(4);
        student1Grades.add(3);
        Student student1 = new Student("student1", 1, 2, student1Grades);
        studentList.add(student1);

        //add student2
        // should remove
        List<Integer> student2Grades = new ArrayList<>();
        student2Grades.add(3);
        student2Grades.add(3);
        student2Grades.add(2);
        Student student2 = new Student("student2", 2, 1, student2Grades);
        studentList.add(student2);

        //add student3
        List<Integer> student3Grades = new ArrayList<>();
        student3Grades.add(4);
        student3Grades.add(3);
        student3Grades.add(5);
        Student student3 = new Student("student3", 2, 1, student3Grades);
        studentList.add(student3);

        //add student4
        // should remove
        List<Integer> student4Grades = new ArrayList<>();
        student4Grades.add(2);
        student4Grades.add(2);
        student4Grades.add(2);
        Student student4 = new Student("student4", 2, 1, student4Grades);
        studentList.add(student4);

        //add student5
        List<Integer> student5Grades = new ArrayList<>();
        student5Grades.add(5);
        student5Grades.add(5);
        student5Grades.add(5);
        Student student5 = new Student("student5", 2, 2, student5Grades);
        studentList.add(student5);

//        //print all students
//        System.out.println("----- Students: ----- \n");
//        for (Student student : studentList) {
//            System.out.println(student.toString());
//        }

        //Remove students with grades less than 3
        List<Student> studentsToRemove = new ArrayList<>();
        for (Student student : studentList) {
            if (!student.isPromoted()) {
                studentsToRemove.add(student);
            }
        }
        studentList.removeAll(studentsToRemove);

        // Print students enrolled in course 2
        Student.printStudents(studentList, 2);

        // Print students enrolled in course 3
        Student.printStudents(studentList, 3);
    }
}
