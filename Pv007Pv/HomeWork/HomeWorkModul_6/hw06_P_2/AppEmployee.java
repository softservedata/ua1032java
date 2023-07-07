package hw06_P_2;

/** • Create a class called Developer that extends the Employee class. Define a String field
 and a constructor to initialize all fields in the Developer class.
 • In the Developer class, override the report() method to return a string with information
 about the developer, for example:
 Name: Taras, Age: 32 years, Position: Average Java developer, Salary: 32735.35
 • If necessary, modify the Employee class to adhere to the principles of encapsulation and
 inheritance.
 • In main() method create an instance of both the Employee and Developer classes and
 print information about them in the console using report() method.
 */

/**
 * Class representing the main application for managing employees and developers.

 */
public class AppEmployee {

    public static void main(String[] args) {
        
        // Create an array of employees
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Olya", 29, 22754.34);
        employees[1] = new Employee("Mary", 19, 10732.55);
        employees[2] = new Employee("Yarik", 50, 32787.11);

        System.out.println("----------------------------------");

        // Print the report for each employee
        for (Employee employee : employees) {
            System.out.println(employee.report());
        }

        System.out.println("----------------------------------");

        // Create an array of developers
        Developer[] developers = new Developer[3];
        developers[0] = new Developer("Taras", 32, 32735.35,"Average Java developer");
        developers[1] = new Developer("Ivan", 25, 20735.35,"Junior Java developer");
        developers[2] = new Developer("Ivo", 70, 62735.35,"Senior developer");

        System.out.println(developers[0].report());
        System.out.println("----------------------------------");

        // Print the report for each developer
        for (Developer developer : developers) {
            System.out.println(developer.report());
        }

        System.out.println("----------------------------------");
    }
}

