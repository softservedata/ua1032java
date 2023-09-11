package com.softserve.edu.CollectionPart1.UniversityStudents;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        String name, group, courseStr;
        int age;
        Course course;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        for(int i = 0; i != 5; i++){


            name = "Volodymyr";
            age = 19;


            course = Course.findValue(String.valueOf(random.nextInt(1,7)));
            group = "Fei-" + String.valueOf(course.getCourse()) + String.valueOf(String.valueOf(random.nextInt(1,4)));
            students.add(i, new Student(name, age, group, course, random.nextInt(1,6)));
        }
        sc.close();


        University university = new University();
        university.print(students);
        university.removeAndPromoteStudent(students);
        System.out.println("Promoted or removed: ");
        university.print(students);
    }
}
