package com.softserve.hw09.Task02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] grades = {4, 6, 2};
        List<Student> students = new ArrayList<>();
        students.add(new Student("Yaroslav", "KN-116", 2, new int[]{4, 1, 2}));
        students.add(new Student("Oleksiy", "KN-116", 2, new int[]{3, 5, 3}));
        students.add(new Student("Ivan", "KN-116", 3, new int[]{4, 3, 2}));
        printStudents(students,2);
        average(students);
        System.out.println(students);
    }

    public static void printStudents(List<Student> students, int course){
        for(Student std1 : students){
            if(std1.getCourse() == course){
                System.out.println(std1.getName());
            }
        }
    }

    public static void average(List<Student> students){
        for(int i = 0; i < students.size(); i++){
            Student std2 = students.get(i);
            double average = 0;
            for(int j = 0; j < std2.getGrades().length; j++){
                average += std2.getGrades()[j];
            }
            average /= (double) std2.getGrades().length;
            if(average < 3){
                students.remove(std2);
                i--;
            } else {
                students.get(i).setCourse(std2.getCourse() + 1);
            }
        }
    }
}
