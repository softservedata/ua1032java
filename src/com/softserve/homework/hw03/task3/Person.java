package com.softserve.homework.hw03.task3;

import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class Person {
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
        Year year = Year.now();
        int currentYear = year.getValue();
        if(birthYear < currentYear) {
            this.birthYear = birthYear;
        }
        else System.out.println("Invalid birth year\n");
    }

    public static int getAge(int birthYear){
        int currentYear = LocalDate.now().getYear();
        return currentYear-birthYear;
    }



    public void input(Person person){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input fist name: ");
        String firstName = sc.nextLine();
        person.setFirstName(firstName);

        System.out.println("Input last name: ");
        String lastName = sc.nextLine();
        person.setLastName(lastName);

        System.out.println("Input birth year: ");
        int birthYear = sc.nextInt();
        person.setBirthYear(birthYear);
    }

    public void output(){
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Years: " + Person.getAge(getBirthYear()));
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public void changeName(String fn, String ln){
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to change?\n" +
                 "f - first name\n"+
                 "l- last name\n" +
                 "fl - first and last names"
                );
        String change = sc.nextLine();
        switch (change){
            case "f" -> {
                if(fn!= null) {
                    firstName = fn;
                    System.out.println("Changed first name");
                }
            }
            case "l"-> {
                if (ln != null) {
                    lastName = ln;
                    System.out.println("Changed last name");
                }
            }

            case "fl"-> {
                if (fn != null && ln != null) {
                    firstName = fn;
                    lastName = ln;
                    System.out.println("Changed first and last names");
                }
            }
            default-> {
                System.out.println("Input correct parameters");
            }
        }
    }
}
