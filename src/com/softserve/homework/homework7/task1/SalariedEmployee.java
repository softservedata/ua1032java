package com.softserve.homework.homework7.task1;

public class SalariedEmployee extends Employee implements Payment {
    String socialSecurityNumber;
    int salary;

    public SalariedEmployee(String employeeId, String name, int salary, String socialSecurityNumber) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }

    @Override
    public String toString() {
        return "\nSalariedEmployee { " +
                "socialSecurityNumber = '" + socialSecurityNumber + '\'' +
                ", salary = $" + calculatePay() +
                ", employeeId = '" + employeeId + '\'' +
                ", name = '" + name + '\'' +
                " }";
    }
}
