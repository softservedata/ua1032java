package hm08;
//Your solution is correct.
//Here some improvements:
/**
 * Data Validation:
 * Add validation in the FullName class for the first name and last name, ensuring they are not empty or null.
 * This guarantees that a valid FullName object will always be present.
 * Add validation for the age to ensure it's non-negative.

 * Immutable FullName:
 * To guarantee data immutability, consider making the FullName class immutable.
 * To achieve this, remove the setters and make the fields final.
 *
 * Override toString():
 * For better object information representation, consider overriding the toString() method
 * for both FullName and Person classes.

  */
public class task01 {
    public static class FullName {
        private String firstName;
        private String lastName;

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

    public static abstract class Person {
        private FullName fullName;
        private int age;

        public Person(FullName fullName, int age) {
            this.fullName = fullName;
            this.age = age;
        }

        public FullName getFullName() {
            return fullName;
        }

        public void setFullName(FullName fullName) {
            this.fullName = fullName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age >= 0) {
                this.age = age;
            } else {
                throw new IllegalArgumentException("Age cannot be negative.");
            }
        }

        public String info() {
            return String.format("First name: %s, Last name: %s, Age: %d",
                fullName.getFirstName(), fullName.getLastName(), age);
        }

        public abstract String activity();
    }
}
