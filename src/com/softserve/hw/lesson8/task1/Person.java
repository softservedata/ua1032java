package com.softserve.hw.lesson8.task1;

public class Person {
    FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info() {
        return "Name: " + fullName.getFirstName() +
                ",Last name:" + fullName.getSecondName() +
                ",Age:" + getAge();


    }
//    public abstract String activity(){
//
//    };
}
