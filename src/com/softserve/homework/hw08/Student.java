package com.softserve.homework.hw08;

public class Student extends Person implements Cloneable {

    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public String info() {
        return "Course: " + course +", "+ super.info() ;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person cloneOfStudent = (Student) super.clone();
        cloneOfStudent.fullName = (FullName) cloneOfStudent.fullName.clone();
        return cloneOfStudent;
    }
}
