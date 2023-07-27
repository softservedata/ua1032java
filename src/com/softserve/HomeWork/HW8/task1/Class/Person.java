package com.softserve.HomeWork.HW8.task1.Class;

public abstract class Person {
    FullName fullName;
    int age;

    public class FullName {
        private String firstName;
        private String lastName;

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    public Person(String firstName, String lastname, int age) {
        fullName = new FullName(firstName, lastname);
        this.age = age;
    }

    public String info() {
        return "First name: " + fullName.firstName + ", Last name: " + fullName.lastName + ", Age: " + age;
    }

    public abstract String activity();
}
