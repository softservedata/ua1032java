package com.softserve.hw07.Task01;

import java.util.Comparator;

public abstract class Employee implements Payment, Comparable<Employee>{

    public static class BySalary implements Comparator<Employee>{
        @Override
        public int compare(Employee e1, Employee e2){
            return (int) (-e1.calculatePay() + e2.calculatePay());
        }
    }

    private String employeeId;
    private String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public Employee(String employeeId) {
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee employee) {
        return (int) (-calculatePay() + employee.calculatePay());
    }

    @Override
    public String toString() {
        return "Employee { " + "EmployeeId = " + employeeId + ", name = " + name + " }";
    }
}
