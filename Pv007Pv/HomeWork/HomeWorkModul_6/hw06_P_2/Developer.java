package hw06_P_2;

/**
 * Class representing a developer, which is a type of employee.
 */
public class Developer extends Employee {
    private String position; // Developer's position

    //Constructor for the Developer class.
    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    //Method to get the developer's position.

    public String getPosition() {
        return position;
    }

    //Method to set the developer's position.
    public void setPosition(String position) {
        this.position = position;
    }

    //Method to generate a report with the developer's information.
    @Override
    public String report() {
        return super.report() + ", " + position;
    }
}

