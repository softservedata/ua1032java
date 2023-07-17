package com.softserve.edu01.hw7;

class ContractEmployee extends Employee {
    private String federalTaxId;
    private double hourlyRate;
    private double hoursWorked;

    public ContractEmployee(String employeeId, String federalTaxId, double hourlyRate, double hoursWorked) {
        super(employeeId);
        this.federalTaxId = federalTaxId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getFederalTaxId() {
        return federalTaxId;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
