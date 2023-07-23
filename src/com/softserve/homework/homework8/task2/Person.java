package com.softserve.homework.homework8.task2;

public abstract class Person implements Cloneable {
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();
        return clone;
    }
}
