package practice2;

public class Employee {
    private String name;
    private double rate;
    private double hours;
    static double totalSum;


    //empty constructor
    public Employee() {
    }

    //construct with 2 parameters
    public Employee(double rate, double hours) {
        this.rate = rate;
        this.hours = hours;
    }

    //constructor with 3 parameters
    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public static double getBonuses(double salary){
        return salary * 0.1;
    }

    public static double getSalary(double rate, double hours){
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }


    public static void main (String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Ivan";
        employee1.rate = 16;
        employee1.hours = 80;

        //salary without bonuses
        double salary1 = getSalary(employee1.rate, employee1.hours);
        //salary with bonuses
        salary1 += getBonuses(salary1);

        Employee employee2 = new Employee();
        employee2.name = "Andrii";
        employee2.rate = 8;
        employee2.hours = 70;

        //salary without bonuses
        double salary2 = getSalary(employee2.rate, employee2.hours);
        //salary with bonuses
        salary2 += getBonuses(salary2);

        Employee employee3 = new Employee();
        employee3.name = "Sergii";
        employee3.rate = 12;
        employee3.hours = 90;

        //salary without bonuses
        double salary3 = getSalary(employee3.rate, employee3.hours);
        //salary with bonuses
        salary3 += getBonuses(salary3);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println("Total salary is: " + (salary1 + salary2 + salary3));

    }
}


















