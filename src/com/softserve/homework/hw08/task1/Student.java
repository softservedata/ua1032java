package com.softserve.homework.hw08.task1;

public class Student extends AbstractPerson implements Cloneable {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }
    public Student() {
        super();
        this.course = 0;
    }

    public Student(String firstName, String lastName, int age, int course) {
        super();
        this.getFullName().setFirstName(firstName);
        this.getFullName().setLastName(lastName);
        this.setAge(age);
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
        return "I'm studying at the university";
    }



    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String toString() {
        return "\n" + info();
    }


    @Override
    protected Object clone () throws CloneNotSupportedException {

        Student copy = (Student) super.clone();

        FullName copyFullName = (FullName) getFullName().clone(); //явне зведенн€ типу

        copy.setFullName(copyFullName);

        return copy;
    }
}