package com.softserve.homework.homework10.task3;

public class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
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
    public String toString() {
        return "Student { " +
                "name = '" + name + '\'' +
                ", course = " + course +
                " }";
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }

    public int compareByName(Student o) {
        return this.getName().compareTo(o.getName());
    }

    public int compareByCourse (Student o) {
        return course - o.getCourse();
    }
}
