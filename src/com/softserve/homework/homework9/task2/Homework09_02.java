package com.softserve.homework.homework9.task2;

import java.util.ArrayList;
import java.util.List;

public class Homework09_02 {
    // TODO: Create a class called Student which includes the following fields: name, group, course, and grades in different subjects.
    //      Create a collection that holds all objects. Write a methods that:
    //      - removes students with a grade point average of less than 3. If a student's average score is 3 or higher, then they will be automatically promoted to the next course level.
    //      - printStudents(List<Student> students, int course) which takes a list of students and a course number as inputs. This method should print out the names of the students who are enrolled in the specified course number to the console.
    //      In main() method create collection and output result.

    public static void graduateStudents(List<Student> students) {
        double averageGradeValue;

        for(int i = students.size() - 1; i > 0; i--) {
            averageGradeValue = 0;
            List<Integer> temp = students.get(i).getGrades();
            for (Integer integer : temp) {
                averageGradeValue += integer;
            }

            if((averageGradeValue / 6) < 3) students.remove(i);
            else students.get(i).setCourse(students.get(i).getCourse() + 1);
        }
    }

    public static void printStudents(List<Student> student, int course) {
        System.out.println("All students of " + course + " course");
        student.forEach(st -> {
            if(st.getCourse() == course) System.out.println(st);
        });
    }

    public static void main(String[] args) {
        List<Student> studentsInfo = List.of(
                new Student("John Smith", "2B", 2, List.of(4, 2, 1, 1, 5, 3)),
                new Student("Mary Jones", "2B", 2, List.of(4, 5, 5, 4, 5, 3)),
                new Student("Elizabeth Green", "1A", 1, List.of(1, 2, 1, 3, 5, 2)),
                new Student("David Brown", "3C", 1, List.of(5, 5, 5, 5, 5, 4)),
                new Student("Michael Williams", "1A", 3, List.of(2, 2, 5, 4, 5, 3))
        );
        List<Student> students = new ArrayList<>(studentsInfo);

        System.out.println("Original:");
        students.forEach(System.out::println);
        graduateStudents(students);
        System.out.println();
        System.out.println("Graduated students:");
        students.forEach(System.out::println);
        System.out.println();
        printStudents(students, 3);
    }
}