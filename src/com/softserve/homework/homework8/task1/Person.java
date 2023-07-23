package com.softserve.homework.homework8.task1;

public abstract class Person implements Cloneable {
    private FullName fullName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        fullName = new FullName(firstName, lastName);
        this.age = age;
    }

    public String info() {
        return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", age " + age;
    }

    public void setFullName(String firstName, String lastName) {
        fullName.setFirstName(firstName);
        fullName.setLastName(lastName);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String activity();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();
        clone.fullName = (FullName) clone.fullName.clone();
        return clone;
    }
}
