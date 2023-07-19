package com.softserve.HW7.task1.Class;

public abstract class Employee implements Comparable<Employee> {
    protected String name;
    protected String employeeld;
    protected double paid;

    public Employee(String name,String employeeld) {
        this.name = name;
        this.employeeld = employeeld;
    }
    public double getPaid() {
        return paid;
    }

    public String getEmployeeld() {
        return employeeld;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", employeeld='" + employeeld + '\'' ;
    }
}
