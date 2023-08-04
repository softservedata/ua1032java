package com.softserve.edu.OOPpart2.Homework18;

public class SalariedEmployee extends Employee{

    private String socialSecurityNumber;

    private double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "Employee id = '"+ getEmployeeId() + '\''+
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", Payment = " + calculatePay() +
                '}';
    }
}
