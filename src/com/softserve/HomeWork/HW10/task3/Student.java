package com.softserve.HomeWork.HW10.task3;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    
    @Override
    public String toString() {
        return "\nStudent{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public int compareTo(Student otherStudent) {
        int i = this.name.compareTo(otherStudent.name);
        if (i == 0){
             i = this.course - otherStudent.getCourse();
        }
        return i;
    }
}
