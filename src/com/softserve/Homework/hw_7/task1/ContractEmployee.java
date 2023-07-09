package com.softserve.Homework.hw_7.task1;

public class ContractEmployee extends Employee implements Payment {
    double fixedMonthlyPayment;
    String federalTaxIdmember;

    ContractEmployee(String employeeId, String name, double fixedMonthlyPayment, String federalTaxIdmember) {
        super(employeeId, name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
}

