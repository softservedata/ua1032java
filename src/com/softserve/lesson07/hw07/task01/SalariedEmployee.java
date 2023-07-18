package com.softserve.lesson07.hw07.task01;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private int hourlyRate;
    private int numberOfHoursWorked;

    public SalariedEmployee(String employeeId, String name, int hourlyRate, int numberOfHoursWorked) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public int calculatePay() {
        return (hourlyRate*numberOfHoursWorked);
    }
}
