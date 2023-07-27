package com.softserve.HomeWork.HW8.task2.Class;

import com.softserve.HomeWork.HW8.task1.Class.Person;

public class Student extends Person {
    private int course;

    public Student(String firstName, String lastname, int age, int course) {
        super(firstName, lastname, age);
        this.course = course;
    }
    @Override
    public String info(){
        return super.info() + ", Course: "+ course;
    }
    @Override
    public String activity() {
        return "I study at university";
    }
}
