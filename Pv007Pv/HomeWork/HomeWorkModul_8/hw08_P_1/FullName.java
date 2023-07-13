package hw08_P_1;

/**
 * The FullName class represents a person's full name.
 */
public class FullName {
    private String firstName; // Private field to store the first name.
    private String lastName; // Private field to store the last name.

    // Constructs a FullName object with the specified first name and last name.
    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Returns the first name of the person.
    public String getFirstName() {
        return firstName;
    }

    // Sets the first name of the person.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Returns the last name of the person.
    public String getLastName() {
        return lastName;
    }

    //Sets the last name of the person.
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
