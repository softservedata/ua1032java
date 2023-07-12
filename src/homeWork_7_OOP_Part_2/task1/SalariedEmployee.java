package homeWork_7_OOP_Part_2.task1;

public class SalariedEmployee extends Employee implements Payment{
    private String name;
    private double salary;
    private String socialSecurityNumber;

    @Override
    public double getSalary() {
        return salary;
    }

    public SalariedEmployee(String employeeID, String name, double salary) {
        this.socialSecurityNumber = employeeID;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "name='" + name + '\'' +
                ", salary=" + salary+", socialSecurityNumber= "+socialSecurityNumber+"\n";
    }

    @Override
    public double calculatePay() {
        return salary;
    }



}
