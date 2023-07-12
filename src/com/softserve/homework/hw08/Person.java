package com.softserve.homework.hw08;

abstract class Person implements Cloneable {
    FullName fullName;
    int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return "First name: " + fullName.getFirstName() + ", last name: " + fullName.getLastName() + ", age: " + age;
    }

    abstract public String activity();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person copyOfPerson = (Person) super.clone();
        copyOfPerson.fullName = (FullName) fullName.clone();
        return copyOfPerson;
    }
}
