package hm06;

public class Task02 {
    static class Employee {
        private String name;
        private int age;
        private String position;
        private double salary;

        public Employee(String name, int age, String position, double salary) {
            this.name = name;
            this.age = age;
            this.position = position;
            this.salary = salary;
        }

        public String report() {
            return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f", name, age, salary);
        }
    }

    static class Developer extends Employee {
        private String developerType;

        public Developer(String name, int age, String position, double salary, String developerType) {
            super(name, age, position, salary);
            this.developerType = developerType;
        }

        @Override
        public String report() {
            return super.report() + ", Developer Type: " + developerType;
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John", 30, "Manager", 50000.0);
        Developer developer = new Developer("Taras", 32, "Average Java developer", 32222.35, "Backend");

        System.out.println("Employee Information:");
        System.out.println(employee.report());

        System.out.println("\nDeveloper Information:");
        System.out.println(developer.report());
    }
}
