import java.util.Calendar;

// The class fields.
public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

 // The constructor is empty.
    Person () {
    }

    // The Constructor with 2 parameters (name and surname).
    Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // The Designer with all 3 parameters (first name, last name and birthday).
    Person (String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    // The method input() - to input information about the person.
    public void input (String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    // The method output() - to output information about the person.
    public String output() {
        if (birthYear <= 0) {
            return "Name: " + firstName + "\n" + "Lastname: " + lastName;

        } else {
            return "Name: " + firstName + "\n" + "Lastname: " + lastName + "\n" + "Birth year: " + birthYear;
        }
    }

    // The method getAge() - to calculate the age of a person.
    public String getAge() {
        //A Calendar object is created that represents the current date and time.
        Calendar calendar = Calendar.getInstance();
        // calendar.get(Calendar.YEAR) returns the current year from the calendar object.
        return "age of a person: " + (calendar.get(Calendar.YEAR) - birthYear);
  }

    // The method changeName(String fn, String ln) - to change the first name or/and last name.
    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }
}
