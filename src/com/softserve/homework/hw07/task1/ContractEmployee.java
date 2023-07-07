package com.softserve.homework.hw07.task1;

public class ContractEmployee extends Employee implements  Payment {
    private String federalTaxIdMember;
    private double fixedMonthlyPayment;

    public ContractEmployee(String employeeId, String name, String federalTaxIdMember, double fixedMonthlyPayment) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePayment(){
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee: " + super.toString() + " average monthly wage: " + calculatePayment();
    }
}
