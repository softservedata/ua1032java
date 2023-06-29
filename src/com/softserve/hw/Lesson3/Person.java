package com.softserve.hw.Lesson3;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;

    private String lastname;
    private int birthYear;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person(String firstName, String lastname, int birthYear) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.birthYear = birthYear;
    }

    public Person() {
    }

    public int getAge() {
        LocalDate ld = LocalDate.now();
        return ld.getYear() - birthYear;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input first name: \n");
        setFirstName(sc.nextLine());
        System.out.print("Please input last name: \n");
        setLastname(sc.nextLine());
        System.out.print("Please input birth year: \n");
        setBirthYear(sc.nextInt());
    }

    public void output() {
        System.out.printf("""
                First name: %s
                Last name: %s
                Birth year: %d
                """, getFirstName(), getLastname(), getBirthYear());
    }
    public void changeName(String fn){
        firstName=fn;

    }
    public void changeName(String fn,String ln){
        if (fn!=null){
            firstName=fn;
        }
        lastname=ln;
    }
}
