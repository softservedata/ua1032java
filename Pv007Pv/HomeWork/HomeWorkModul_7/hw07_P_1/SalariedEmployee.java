package hw07_P_1;

public class SalariedEmployee extends Employee implements Payment{
    private double salary; // private field to store the employee's salary
    private String socialSecurityNumber; // private field to store the employee's social security number
    // Constructor for the SalariedEmployee class
    public SalariedEmployee(String employeId, String name, double salary, String socialSecurityNumber) {
        super(employeId, name);
        this.salary = salary;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    // Getter method for retrieving the employee's salary
    public double getSalary() {
        return salary;
    }
    // Setter method for setting the employee's salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
    // Getter method for retrieving the employee's social security number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    // Setter method for setting the employee's social security number
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    // Implementation of the calculatePay() method from the Payment interface
    @Override
    public double calculatePay() {
        return salary;
    }
    // Override the toString() method
    @Override
    public String toString() {
        return "SalariedEmployee { " +
                " salary= " + salary +
                ", socialSecurityNumber= " + socialSecurityNumber +
                ", employeId= " + employeeId +
                ", name= " + name + '}';
    }
}
