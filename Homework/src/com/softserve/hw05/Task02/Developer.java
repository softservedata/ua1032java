package com.softserve.hw05.Task02;

public class Developer extends Employee{
    private String position;


    public Developer(String name, int age, String position, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    public String report(){
        return super.report() + ", Position: " + position;
    }
}
