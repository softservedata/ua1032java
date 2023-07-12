package com.softserve.HomeWork.HW6.task2.Class;

public class Developer extends Employee {
    String position;

    public Developer(String name, int age,String position, double salary) {
        super(name, age, salary);
        this.position = position;
    }
    @Override
    public String report(){
        return super.report() + " Position: "+ position;
    }
}
