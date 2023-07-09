package com.softserve.hw.lesson7.task1;

public class ContractEmployee extends Employee implements Payment {
    private int FederalTaxIdmember;
    private int hourlyRate;
    private int hoursWork;

    public ContractEmployee(String employeeID, String name, int federalTaxIdmember, int hourlyRate, int hoursWork) {
        super(employeeID, name);
        FederalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.hoursWork = hoursWork;
    }

    public int getFederalTaxIdmember() {
        return FederalTaxIdmember;
    }

    public void setFederalTaxIdmember(int federalTaxIdmember) {
        FederalTaxIdmember = federalTaxIdmember;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWork() {
        return hoursWork;
    }

    public void setHoursWork(int hoursWork) {
        this.hoursWork = hoursWork;
    }
    @Override
    public double calculatePay() {
        return hourlyRate * hoursWork;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "FederalTaxIdmember=" + FederalTaxIdmember +
                ", hourlyRate=" + hourlyRate +
                ", hoursWork=" + hoursWork +
                ", employeeID='" + employeeID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
