package com.softserve.lesson07.hw07.task01;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdMember;
    private int fixedMonthlyPayment;

    public ContractEmployee(String employeeId, String name, int fixedMonthlyPayment) {
        super(employeeId, name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;
    }
}
