package com.softserve.hw07.Task01;

public class SalariedEmployee extends Employee implements Payment {

    private String socialSecurityNumber;
    private double hourlyRate;
    private double numberOfHoursWorked;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double hourlyRate, double numberOfHoursWorked) {
        super(employeeId ,name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    @Override
    public double calculatePay() {
        return getHourlyRate() * getNumberOfHoursWorked();
    }

    @Override
    public String toString() {
        return "\nSalariedEmployee{ " + "Employee ID = "
                + getEmployeeId() + ", Name = "
                + getName() + ", Salary = "
                + calculatePay() + " }";
    }
}
