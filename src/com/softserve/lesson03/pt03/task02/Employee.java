package com.softserve.lesson03.pt03.task02;

public class Employee {

    private String name;
    private float rate;
    private float hours;

    public static float totalSum;

    public Employee () {
        name = "";
        rate = 0;
        hours = 0;
    }

    public Employee (String name) {
        this.name = name;
        rate = 0;
        hours = 0;
    }

    public Employee(String name, float rate, float hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Employee { " +
                "name= '" + name + '\'' +
                ", rate= " + rate +
                ", hours= " + hours +
                '}';
    }

    public float getSalary() {
        return this.getRate()*this.getHours();
    }

    public float getBonuses() {
        return (float) (this.getSalary() * 0.1);
    }
}
