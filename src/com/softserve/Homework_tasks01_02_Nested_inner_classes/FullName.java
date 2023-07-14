package com.softserve.Homework_tasks01_02_Nested_inner_classes;

class FullName {
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + age;
    }

    public abstract String activity();

    public abstract void setCourse(int i);
}

class Employee extends Person {
    public Employee(FullName fullName, int age) {
        super(fullName, age);
    }

    @Override
    public String activity() {
        return "Working";
    }
}

class Student extends Person {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }
}

public class Main {
    public static void main(String[] args) {
        FullName fullName1 = new FullName("John", "Doe");
        Student student1 = new Student(fullName1, 20, 3);
        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println("----------------------------------------");

        FullName fullName2 = new FullName("Alice", "Smith");
        Student student2 = new Student(fullName2, 22, 4);
        System.out.println(student2.info());
        System.out.println(student2.activity());

        System.out.println("----------------------------------------");

        Student student3 = student1.clone();
        student3.setCourse(2);
        System.out.println("Student 1:");
        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println("Student 3 (Cloned Student 1 with Course Changed):");
        System.out.println(student3.info());
        System.out.println(student3.activity());
    }
}