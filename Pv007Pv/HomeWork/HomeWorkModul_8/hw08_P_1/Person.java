package hw08_P_1;

/**
 * The Person class is an abstract class representing a person.
 */
public abstract class Person {
    private FullName fullName; // Private field to store the full name.
    private int age; // Private field to store the age.

    // Constructs a Person object with the specified full name and age.

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Returns a string representation of the person's information.
    public String info() {
        return "First name: " + fullName.getFirstName() +
                ", Last name: " + fullName.getLastName() +
                ", Age: " + age;
    }

    //Abstract method to be implemented by concrete subclasses.
    public abstract String activity();
}



