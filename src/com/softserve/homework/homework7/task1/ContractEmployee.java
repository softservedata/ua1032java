package com.softserve.homework.homework7.task1;

public class ContractEmployee extends Employee implements Payment {
    String federalTaxIdMember;
    double rate;
    int hours;

    public ContractEmployee(String employeeId, String name, double rate, int hours, String federalTaxIdMember) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public double calculatePay() {
        return rate * hours;
    }

    @Override
    public String toString() {
        return "\nContractEmployee { " +
                "federalTaxIdMember = '" + federalTaxIdMember + '\'' +
                ", salary = $" + calculatePay() +
                ", employeeId = '" + employeeId + '\'' +
                ", name = '" + name + '\'' +
                " }";
    }
}
