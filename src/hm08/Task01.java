package hm08;

public class Task01 {
    public class FullName {
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

    public abstract class Person {
        private FullName fullName;
        private int age;

        public Person(FullName fullName,int age){
            this.fullName = fullName;
            this.age = age;
        }
        public String info(){
            return String.format("First name: %s,Last name: %s,Age: %d",
                    fullName.getFirstName(),fullName.getLastName(),age);
        }
        public abstract String activity();

    }
    }