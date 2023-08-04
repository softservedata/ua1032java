package com.softserve.edu01.hw8.task1;

public class ConcretePerson extends Person {

    public ConcretePerson(FullName fullName, int age) {
        super(fullName, age);
    }

    @Override
    public String activity() {
        // Define the activity of the person here
        return "Activity: Programing";
    }
}