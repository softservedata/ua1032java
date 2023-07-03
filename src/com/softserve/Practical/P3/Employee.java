package com.softserve.Practical.P3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Employee{

    String name;
    int rate;
    int hours;
    static int totalSum;
    private void setTotalSum(){
        totalSum += getSalary();
    }
    public int getTotalSum(){
        return totalSum;
    }
    public Employee(){
        name = "noName";
        rate = 0;
        hours = 0;
        setTotalSum();
    }
    public Employee(String name, int rate){
        this.name = name;
        this.rate = rate;
        hours = 0;
        setTotalSum();
    }
    public Employee(String name, int rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        setTotalSum();
    }
    public void input() throws IOException{
        totalSum -= getSalary();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Name: ");
        name = br.readLine();
        System.out.println("Rate: ");
        rate = Integer.parseInt(br.readLine());
        System.out.println("hours: ");
        rate = Integer.parseInt(br.readLine());
        setTotalSum();
    }
    public int getSalary(){
        return rate * hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        totalSum -= getSalary();
        this.rate = rate;
        setTotalSum();
    }

    public int getHours() {
        return hours;

    }

    public void setHours(int hours) {
        totalSum -= getSalary();
        this.hours = hours;
        setTotalSum();
    }
    public void getBonus(int interest){
        totalSum -= getSalary();
        rate += rate*interest/100;
        setTotalSum();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
