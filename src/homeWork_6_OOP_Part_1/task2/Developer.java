package homeWork_6_OOP_Part_1.task2;

public class Developer extends Employee{

    private String position;

    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    public Developer(String name, int age, double salary,  String position) {
        super(name, age, salary);

        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Position: %s, Age: %d,Salary: \u20b4 %.2f.", name, position, age, salary);
    }
}
