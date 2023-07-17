package firstHomework;

public abstract class Employee {
    private String employeeId;

    public abstract double calculatePay();

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

}
