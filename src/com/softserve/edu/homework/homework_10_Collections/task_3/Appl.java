package com.softserve.edu.homework.homework_10_Collections.task_3;

import java.util.*;
public class Appl {
    public static void main(String [] args){
        Map<String, Object>[] students = new HashMap[5];
        students[0] = Student.createStudentData("Mike",4);
        students[1] = Student.createStudentData("Leonard",1);
        students[2] = Student.createStudentData("Ron",2);
        students[3] = Student.createStudentData("Albert",3);
        students[4] = Student.createStudentData("Leo",2);

        Student.printStudents(students);
        Student.students_course(students);
        Student.comparing_elements_by_name(students);
        Student.comparing_elements_by_course(students);

    }
}
