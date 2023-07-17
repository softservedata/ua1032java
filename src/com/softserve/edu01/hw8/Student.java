package com.softserve.edu01.hw8;

import com.softserve.edu01.hw3_3Task.Person;

public class Student extends Person {
    private String school;

    public Student(FullName fullName, int age, String school) {
        super(fullName, age);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String activity() {
        return "Studying at " + school;
    }
}
