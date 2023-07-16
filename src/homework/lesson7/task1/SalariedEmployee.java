package homework.lesson7.task1;

public class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private int hours;
    private float salaryPerHour;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, int hours, float salaryPerHour) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hours = hours;
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public float calculatePay() {
        monthlyWage = hours * salaryPerHour;
        return monthlyWage;
    }

    @Override
    public String toString() {
        return "\nSalariedEmployee { " +
                "name = " + name +
                ", socialSecurityNumber = " + socialSecurityNumber +
                ", monthlyWage = $" + monthlyWage +
                ", employeeId = " + employeeId +
                " }";
    }
}
