package com.softserve.hw02.Task03;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

   public Person(){
        firstName = "";
        lastName = "";
        birthYear = 0;
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
        return 2023 - birthYear;
    }

    public void changeName(String fn, String ln){
        if (fn != null){
            setFirstName(fn);
        }
        if(ln != null){
            setLastName(ln);
        }
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        setFirstName(sc.nextLine());
        System.out.println("Enter last name: ");
        setLastName(sc.nextLine());
        System.out.println("Enter birth year: ");
        setBirthYear(sc.nextInt());
    }

    public void output() {
        System.out.println("First Name: " + getFirstName()
                + " Last Name: " + getLastName()
                + " Birth Year: " + getBirthYear());
    }
}
