package com.softserve.edu.CollectionPart1.UniversityStudents;

import java.util.List;

public class University {
    public void removeAndPromoteStudent(List<Student> students){
        Student student;
        int sizeArr = students.size();
        for (int i = 0; i <= students.size() - 1; i++){
            student = students.get(i);
            if(student.getGrades() < 3){
                students.remove(i);
                i--;
            }else if(student.getGrades() >= 3){
                student.setCourse(student.getCourse().nextCourse(student.getCourse()));
            }
        }
    }
    public void print(List<Student> students){

        for (Student student: students){
            System.out.println(student);
        }
    }
}
