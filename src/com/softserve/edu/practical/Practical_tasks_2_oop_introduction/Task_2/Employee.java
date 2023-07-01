package com.softserve.edu.practical.Practical_tasks_2_oop_introduction.Task_2;

import java.util.Scanner;

public class Employee {
    private String name ;
    private double rate;
    private float hours;

    public Employee (){
        Scanner input = new Scanner (System.in);
        System.out.println("Name : ");
        this.name = input.nextLine();
        System.out.println("Rate : ");
        this.rate = input.nextDouble();
        System.out.println("Hours : ");
        this.hours = input.nextFloat();
    }
    public Employee (String name, double rate, float hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }
    public String toString(){
        return "Employee {" + " Name : "+name+";   Rate : "+rate+";   Hours : "+ hours + ";  Bonuses : " + getBonuses() + " }";
    }
    public double getBonuses(){
        return (((rate*hours)/100)*10);
    }
    public double getSalary(){
        return rate*hours;
    }

}
