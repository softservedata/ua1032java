package com.softserve.edu.Homeworks2.Homework06;
import java.util.Scanner;
public class Person {
    //three fields
    private String firstName;
    private String lastName;
    private int birthYear;


    // property to get and set firstName
    public String getFirstName(){
        return firstName;
    }
    private void setFirstName(String firstName){
        this.firstName = firstName;
    }

    // property to get and set lastName
    public String getLastName(){
        return lastName;
    }
    private void setLastName(String lastName){
        this.lastName = lastName;
    }

    //propery to get and set birthYear
    public int getBirthYear() {return birthYear;}
    private void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }


    //default constructor
    public Person(){
    }

    //constructor with two parameters
    public Person(String firstName, String lastName, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }


    //calculating the age of a person
    public int getAge(){
        int year = 2023;
        int age = year - getBirthYear();
        return age;
    }

    //we input here values
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Write first name: ");
        String firstName = scan.nextLine();
        System.out.print("Write last name: ");
        String lastName = scan.nextLine();
        System.out.print("Write birth year: ");
        int birthYear = scan.nextInt();

        //inserts values into setter and then fields will be having these values
        setFirstName(firstName);
        setLastName(lastName);
        setBirthYear(birthYear);
    }

    public void changeName(String fn, String ln){
        setFirstName(fn);
        setLastName(ln);
    }
    public void changeFirstName(String fn){
        setFirstName(fn);
    }
    public void changeLastName(String ln){
        setLastName(ln);
    }
    //output's the values
    public void output(){
        System.out.println("First name of the person: " + getFirstName());
        System.out.println("Last name of the person: " + getLastName());
        System.out.println("Birth year: " + getBirthYear());
        System.out.println("Age of the person: " + getAge());
    }


}
