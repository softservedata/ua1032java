package com.softserve.lesson07.hw07.task01;

public abstract class Employee implements Payment, Comparable<Employee> {
    private String employeeId;
    private String name;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee (String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public int compareTo(Employee o) {
        return Integer.compare(this.calculatePay(), o.calculatePay());
    }

    @Override
    public String toString() {
        return "Employee {" +
                "employeeId= '" + employeeId + '\'' +
                ", name= '" + name + '\'' +
                '}';
    }
}
