package hm08;

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
