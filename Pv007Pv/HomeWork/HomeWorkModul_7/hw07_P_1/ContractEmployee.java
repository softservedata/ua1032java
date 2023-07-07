package hw07_P_1;

public class ContractEmployee extends Employee implements Payment{
    private double hourlyRate; // private field to store the employee's hourly rate
    private int hoursWorked; // private field to store the number of hours worked
    private int federalTaxIdmember; // private field to store the employee's federal tax ID member
    // Constructor for the ContractEmployee class
    public ContractEmployee(String employeId, String name, double hourlyRate, int hoursWorked, int federalTaxIdmember) {
        super(employeId, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.federalTaxIdmember = federalTaxIdmember;
    }
    // Getter method for retrieving the employee's hourly rate
    public double getHourlyRate() {
        return hourlyRate;
    }
    // Setter method for setting the employee's hourly rate
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    // Getter method for retrieving the number of hours worked
    public int getHoursWorked() {
        return hoursWorked;
    }
    // Setter method for setting the number of hours worked
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    // Getter method for retrieving the employee's federal tax ID
    public int getFederalTaxIdmember() {
        return federalTaxIdmember;
    }
    // Setter method for setting the employee's federal tax ID member
    public void setFederalTaxIdmember(int federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }
    // Implementation of the calculatePay() method from the Payment interface
    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
    // Override the toString() method
    @Override
    public String toString() {
        return "ContractEmployee { " +
                " hourlyRate= " + hourlyRate +
                ", hoursWorked= " + hoursWorked +
                ", federalTaxIdmember= " + federalTaxIdmember +
                ", employeId= " + employeeId +
                ", name= " + name + '}';
    }
}
