package practical.lesson3.task2;

public class Employee {
    private String name;
    private int rate;
    private int hours;

    public static int totalSum = 0;

    public Employee(){
        this.name = "no name";
        this.rate = 0;
        this.hours = 0;
    }
    public Employee(int rate, int hours) {
        this.rate = rate;
        this.hours = hours;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getSalary(){
        return hours*rate;
    }
    public int getBonuses(){
        int bonuses = this.getSalary()/10;
        return bonuses;
    }

    @Override
    public String toString() {
        return "Employee " +
                "name: " + name  +
                ", rate: " + rate +
                ", hours: " + hours +
                '}';
    }
}
