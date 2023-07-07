package com.softserve.homework.hw07.task1;

public class SalariedEmployee extends Employee implements  Payment {

    private String socialSecurityNumber;
    private double hourlyRate;
    private double numbOfHoursWorked;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double hourlyRate, double numbOfHoursWorked) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numbOfHoursWorked = numbOfHoursWorked;
    }

    @Override
    public double calculatePayment() {
        return hourlyRate * numbOfHoursWorked;
    }

    @Override
    public String toString() {
        return "SalariedEmployee: " + super.toString() + " average monthly wage: " + calculatePayment();
    }
}
