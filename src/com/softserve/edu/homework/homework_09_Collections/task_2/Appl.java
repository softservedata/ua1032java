package com.softserve.edu.homework.homework_09_Collections.task_2;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.io.IOException;
import java.util.LinkedHashMap;
public class Appl {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> grades1 = new LinkedHashMap<>();
        grades1.put("Astronomy", 5);
        grades1.put("Algorithm of computational processes", 5);
        grades1.put("Math", 4);
        Student student1 = new Student("Joseph", "PMP-31s", 3, grades1);

        Map<String, Integer> grades2 = new LinkedHashMap<>();
        grades2.put("Astronomy", 2);
        grades2.put("Algorithm of computational processes", 2);
        grades2.put("Math", 2);
        Student student2 = new Student("Charles", "OPM-12s", 1, grades2);

        Map<String, Integer> grades3 = new LinkedHashMap<>();
        grades3.put("Astronomy", 5);
        grades3.put("Algorithm of computational processes", 5);
        grades3.put("Math", 5);
        Student student3 = new Student("Raymond", "PMA-21s", 2, grades3);

        Map<String, Integer> grades4 = new LinkedHashMap<>();
        grades4.put("Astronomy", 2);
        grades4.put("Algorithm of computational processes", 4);
        grades4.put("Math", 4);
        Student student4 = new Student("Henry", "HPI-46s", 4, grades4);

        Map<String, Integer> grades5 = new LinkedHashMap<>();
        grades5.put("Astronomy", 1);
        grades5.put("Algorithm of computational processes", 2);
        grades5.put("Math", 3);
        Student student5 = new Student("Gabriel", "FHI-31s", 3, grades5);

        Map<String, Integer> grades6 = new LinkedHashMap<>();
        grades6.put("Astronomy", 3);
        grades6.put("Algorithm of computational processes", 3);
        grades6.put("Math", 3);
        Student student6 = new Student("Isabella", "MFA-12s", 1, grades6);

        List<Student> studentCollection = new LinkedList<>();
        studentCollection.add(student1);
        studentCollection.add(student2);
        studentCollection.add(student3);
        studentCollection.add(student4);
        studentCollection.add(student5);
        studentCollection.add(student6);

        for (Student student : studentCollection) {
            System.out.println(student);
        }
        String result = Student.printStudents(studentCollection);
        System.out.println("\tStudents enrolled in the specified course : " + result);

        List<Student> promotedStudents = new LinkedList<>();
        for (Student student : studentCollection) {
            if (student.isPromoted()) {
                promotedStudents.add(student);
            }
            else{
                promotedStudents.remove(student);
            }
        }
        System.out.println("\n\tlist of students without students with an average score below 3 : ");
        for (Student student : promotedStudents) {
            System.out.println(student);
        }
    }
}