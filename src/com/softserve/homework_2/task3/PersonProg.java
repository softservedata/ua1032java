package com.softserve.homework_2.task3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class PersonProg {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person[] persons = new Person[5];

        for (int i = 0; i < 5; i++) {
            persons[i] = new Person();
            persons[i].input(reader);
        }

        for (Person person : persons) {
            person.output();
        }
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public void input(BufferedReader reader) throws IOException {
        System.out.println("Enter first name: ");
        firstName = reader.readLine();

        System.out.println("Enter last name: ");
        lastName = reader.readLine();

        System.out.println("Enter birth year: ");
        birthYear = Integer.parseInt(reader.readLine());
    }

    public void output() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Birth year: " + birthYear);
        System.out.println("Age: " + getAge());
    }


}
