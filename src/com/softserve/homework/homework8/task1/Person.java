package com.softserve.homework.homework8.task1;

public abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age) {
        fullName = new FullName(firstName, lastName);
        this.age = age;
    }

    public String info() {
        return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", age " + age;
    }

    public abstract String activity();
}
