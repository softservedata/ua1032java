package com.softserve.Homework.hw_8.task2;
import com.softserve.Homework.hw_8.task1.FullName;
import com.softserve.Homework.hw_8.task1.Person;
public class Student extends Person implements Cloneable {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }
    public int setCourse(int course) {
        return this.course = course;
    }
    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

