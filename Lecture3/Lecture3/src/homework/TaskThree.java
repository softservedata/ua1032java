package homework;

/* Create Console Application and add class called Person to the project.
 Class Person should consist of:
• three private fields: firstName, lastName and birthYear (the birthday year);
• properties for access to these fields;
• default constructor and constructor with 2 parameters (first and last names);
Methods:
• (**) getAge() - to calculate the age of a person;
• input() - to input information about the person;
• output() - to output information about the person;
• changeName(String fn, String ln) - to change the first name or/and last name.
In the main() method create 5 objects of Person type and input information about them to console. */

public class TaskThree {
    public static void main(String[] args) {

    Person p1 = new Person();
    p1.input();
    p1.output();
    System.out.println("~~~~~~~~~");

    Person p2 = new Person();
    p2.input();
    p2.changeName("Daria", "Shevchuk");
    p2.output();
    System.out.println("~~~~~~~~~");

    Person p3 = new Person();
    p3.setFirstName("Iryna");
    p3.setLastName("Vdovych");
    p3.setBirthYear(2004);
    p3.output();
    System.out.println("~~~~~~~~~");

    Person p4 = new Person("Daria", "Semenyuk");
    p4.setBirthYear(1995);
    p4.changeName("Daria", "Shevchuk");
    p4.output();
    System.out.println("~~~~~~~~~");

    Person p5 = new Person();
    p5.input();
    p5.output();
    }
}
