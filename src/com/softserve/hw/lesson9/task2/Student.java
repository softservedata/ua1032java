package com.softserve.hw.lesson9.task2;

import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grade;

    public Student(String name, String group, int course, List<Integer> grade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getGrade() {
        return grade;
    }

    public void setGrade(List<Integer> grade) {
        this.grade = grade;
    }

    public double averageRating() {
        double result = 0;
        for (Integer inter : grade) {
            result += inter;
        }
        return result / grade.size();
    }

    public boolean transferCourse() {
        if (averageRating() > 3.0) {
            course++;
            return true;
        } else course = 0;
        return false;
    }

    @Override
    public String toString() {
        return "Student: " +
                "name = " + name + " " +
                "group = " + group + " " +
                "course = " + course + " " +
                "grade = " + grade + "\n";
    }

    public static void printStudent(List<Student> students, int course) {
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.getName() + " Course " + course);
            }
        }
    }
}
