package com.softserve.edu.NestedInnerClasses;

public class Student extends Person implements Cloneable{
    private int course;
    private String specialization;
    public Student(FullName name, int age, int course, String specialization) {
        super(name, age);
        this.course = course;
        this.specialization = specialization;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getCourse() {
        return course;
    }

    public String getSpecialization() {
        return specialization;
    }
    @Override
    public String info() {
        return super.info() + String.format(" Course: <%d>" + " Specialization: <%s>", getCourse(), getSpecialization());
    }

    @Override
    public String activity() {
        return "I study at the university of Ivan Franko";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student studentClone = (Student) super.clone();
        studentClone.setName((FullName) getName().clone());
        return studentClone;
    }
}
