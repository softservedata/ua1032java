package homeworkTaskTwo;

/* Create a class called Developer that extends the Employee class.
 Define a String field and a constructor to initialize all fields in the Developer class.
• In the Developer class, override the report() method to return a string with information about the developer, for example:
Name: Taras, Age: 32 years, Position: Average Java developer, Salary: 32735.35
• If necessary, modify the Employee class to adhere to the principles of encapsulation and inheritance.
• In main() method create an instance of both the Employee and Developer classes
and print information about them in the console using report() method. */

public class TestApp {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ihor", 30, 473839959);
        Developer d1 = new Developer("Roman", 19, 8548548, "Java Developer");
        System.out.println(e1.report());
        System.out.println(d1.report());
    }
}
