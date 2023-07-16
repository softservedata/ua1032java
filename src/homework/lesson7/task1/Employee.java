package homework.lesson7.task1;

public abstract class Employee implements Payment, Comparable<Employee>{
    protected String employeeId;
    protected String name;
    protected float monthlyWage;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public float getMonthlyWage() {
        return monthlyWage;
    }

    @Override
    public int compareTo(Employee e) {
        return (int) -(monthlyWage - e.getMonthlyWage());
    }
}
