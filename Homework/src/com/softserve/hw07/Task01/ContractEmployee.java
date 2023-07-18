package com.softserve.hw07.Task01;

public class ContractEmployee extends Employee implements Payment{

    private int federalTaxIdmember;
    private double fixedMonthlyPayment;

    public ContractEmployee(String employeeId, String name, int federalTaxIdmember, double fixedMonthlyPayment) {
        super(employeeId ,name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public int getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "\nContractEmployee{ " + "Employee ID = "
                + getEmployeeId() + ", Name = "
                + getName() + ", Salary = "
                + calculatePay() + " }";
    }
}
