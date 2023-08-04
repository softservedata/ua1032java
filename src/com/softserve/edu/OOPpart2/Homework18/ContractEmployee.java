package com.softserve.edu.OOPpart2.Homework18;

public class ContractEmployee extends Employee{

    private double hourlyRate;

    private double numOfWorkedHours;

    private String federalTaxIdMember;

    public ContractEmployee(String employeeId, String federalTaxIdMember, double hourlyRate, double numOfWorkedHours) {
        super(employeeId);
        this.hourlyRate = hourlyRate;
        this.numOfWorkedHours = numOfWorkedHours;
        this.federalTaxIdMember = federalTaxIdMember;
    }


    @Override
    public double calculatePay() {
        return hourlyRate * numOfWorkedHours;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "Employee id = '"+ getEmployeeId() + '\''+
                ", federalTaxIdMember = '" + federalTaxIdMember + '\'' +
                ", payment = " + calculatePay() +
                '}';
    }
}
