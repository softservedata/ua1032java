package hw07_P_1;

public abstract class Employee {
    protected String employeeId; // The ID of the employee
    public String name; // The name of the employee


    public Employee(String employeId, String name) {
        this.employeeId = employeId;
        this.name = name;
    }
    // Abstract method to calculate the employee's pay
    public abstract double calculatePay();
    // Getter method to retrieve the employee ID
    public String getEmployeId() {
        return employeeId;
    }
    // Getter method to retrieve the employee name
    public String getName() {
        return name;
    }
    // Override the toString() method
    @Override
    public String toString() {
        return "Employee { " +
                "employeId= " + employeeId + '\'' +
                ", name= " + name +
                '}';
    }
}
