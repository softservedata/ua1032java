package com.softserve.edu.CollectionPart1.UniversityStudents;


public class Student extends Person{
    private int grades;
    private String group;
    private Course course;


    public Student(String name, int age,
                   String group, Course course, int grades) {
        super(name, age);
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                " name="+ getName() +
                ", age=" + getAge() +
                ", grades=" + grades +
                ", group='" + group +
                ", course=" + getCourse() + '\'' +
                "}\n";
    }


}
