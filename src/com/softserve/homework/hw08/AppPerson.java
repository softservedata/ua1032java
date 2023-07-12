package com.softserve.homework.hw08;

public class AppPerson {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Student(new FullName("Andrii", "Fedoryshyn"), 20, 22);
        Student copyOfPerson = (Student) person.clone();

        System.out.println("Original: ");
        System.out.println(person.info() + ", " + person.activity());

        System.out.println("Clone: ");
        System.out.println(copyOfPerson.info() + ", " + copyOfPerson.activity());

        copyOfPerson.setCourse(10000000);

        System.out.println("=================");

        System.out.println("Original: ");
        System.out.println(person.info() + ", " + person.activity());

        System.out.println("Clone: ");
        System.out.println(copyOfPerson.info() + ", " + copyOfPerson.activity());
    }
}
