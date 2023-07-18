package com.softserve.homework.homework7.task1;

public abstract class Employee implements Payment, Comparable<Employee> {
    String employeeId;
    String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        return (int) -(calculatePay() - o.calculatePay());
    }
}
