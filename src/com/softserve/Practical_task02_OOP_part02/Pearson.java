package com.softserve.Practical_task02_OOP_part02;

abstract class Person {
    private String name;
    public static final String TYPE_PERSON = "Person";

    public Person(String name) {
        this.name = name;
        System.out.println("Creating a " + TYPE_PERSON + " named " + name);
    }

    public abstract void print();
}

abstract class Staff extends Person {
    public static final String TYPE_PERSON = "Staff";

    public Staff(String name) {
        super(name);
        System.out.println("Creating a " + TYPE_PERSON + " named " + name);
    }

    public abstract void salary();
}

class Teacher extends Staff {
    public static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
        System.out.println("Creating a " + TYPE_PERSON + " named " + name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }

    @Override
    public void salary() {
        System.out.println("Calculating salary for " + TYPE_PERSON);
    }
}

class Cleaner extends Staff {
    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
        System.out.println("Creating a " + TYPE_PERSON + " named " + name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }

    @Override
    public void salary() {
        System.out.println("Calculating salary for " + TYPE_PERSON);
    }
}

class Student extends Person {
    public static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
        System.out.println("Creating a " + TYPE_PERSON + " named " + name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }
}

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Teacher("John");
        people[1] = new Cleaner("Alice");
        people[2] = new Student("Bob");
        people[3] = new Teacher("Mary");

        for (Person person : people) {
            person.print();
        }

        for (Person person : people) {
            if (person instanceof Staff) {
                Staff staff = (Staff) person;
                staff.salary();
            }
        }
    }
}