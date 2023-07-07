package practical.lesson5.task4;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }
    public Employee(){
        this.name = "name";
        this.departmentNumber = 0;
        this.salary = 0;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee" + name + ", departmentNumber = " + departmentNumber + ", salary = " + salary;
    }

}
