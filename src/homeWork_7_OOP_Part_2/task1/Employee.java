package homeWork_7_OOP_Part_2.task1;

public abstract  class Employee implements Comparable <Employee>  {
    protected  String employeeID;

    public abstract double getSalary();

    @Override
    public int compareTo(Employee o) {
        double v = getSalary() - o.getSalary();
        return (int) v;

    }
}
