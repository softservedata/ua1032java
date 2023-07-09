package com.softserve.hw.lesson7.task1;

public class SalariedEmployee extends Employee implements Payment {
    private int socialSecurityNumber;
    private int monthlySalary;

    public SalariedEmployee(String employeeID, String name, int socialSecurityNumber, int monthlySalary) {
        super(employeeID, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.monthlySalary = monthlySalary;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber=" + socialSecurityNumber +
                ", monthlySalary=" + monthlySalary +
                ", employeeID='" + employeeID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
