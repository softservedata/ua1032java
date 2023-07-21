package com.softserve.Practical.P7.task2.Class;

public class Staff extends Person {
    private static final String TYPE_PERSON = "Staff";

    private int salary;

    public Staff(String name, int salary) {
        super(name);
        this.salary = salary;
    }
    public String getTypePerson(){
        return TYPE_PERSON;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println( getName() +" is a Staff");
    }
}
