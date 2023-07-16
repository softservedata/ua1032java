package com.softserve.homework.hw09.task2;
/*
2. Create a class called Student which includes the following fields: name, group, course, and grades in different subjects.
Create a collection that holds all objects. Write a methods that:
removes students with a grade point average of less than 3.
If a student's average score is 3 or higher, then they will be automatically promoted to the next course level.
printStudents(List<Student> students, int course) which takes a list of students and a course number as inputs.
This method should print out the names of the students who are enrolled in the specified course number to the console.
In main() method create collection and output result.

2. ������� ���� �� ������ ��������, ���� ������ ��� ����: ���, �����, ���� � ������ � ����� ��������.
������� ��������, ��� ������ �� �ᒺ���.
�������� ������, ��:
������ �������� �� ������� ����� ����� 3.
���� ������� ��� �������� ��������� 3 ��� ����, �� ����������� ���������� �� ��������� ����� �����.
printStudents(List<Student> students, int course), ���� ������ ������ �������� � ����� ����� �� ����� ���.
��� ����� ������� ������� �� ������� ����� ��������, �� ��������� �� �������� ����� �����.
� ����� main() ������� �������� �� ������� ���������.
 */

import java.util.*;

class App {
    public static void removeUnderperformingStudents(List<Student> students) {

             Iterator<Student> iterator = students.iterator();

             while (iterator.hasNext()) {
                 Student student = iterator.next();
                 if (student.getAverageGrade() < 3) {
                     iterator.remove();
                 } else {
                     student.promoteToNextCourse();
                 }
             }
         }

    public static void printStudents(List<Student> students, int course) {
        System.out.println( "Students studying at " + course + " course:" );
        for (Student student : students
        ) {
            if ( student.getCourse( ) == course ) {
                System.out.println( student.getName( ) );
            }
        }
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        List<Double> grades1 = List.of(4.4, 3.3, 4.4);
        studentList.add(new Student("Dmytro Dmytriv", "Group A", 1, grades1));
        List<Double> grades2 = List.of(3.2, 2.5, 2.9);
        studentList.add(new Student("Petro Petriv", "Group A", 1, grades2));
        List<Double> grades3 = List.of(3.8, 4.2, 4.3);
        studentList.add(new Student("Vasil Vasiv", "Group B", 2, grades3));

        removeUnderperformingStudents(studentList);

        printStudents(studentList, 2);
        printStudents(studentList, 3);
    }
}