package com.softserve.edu07ab;

public class AppDirector {
    public static void main(String[] args) {
        Worker w = new Director();
        System.out.println("w.getSalary() = " + w.getSalary());
        System.out.println("PI = " + Director.PI);
    }
}
