package homeWork_8_Nested_Inner_CLasses;

public abstract class Person {
    FullName fullName = new FullName();
    int age;

    public Person(String firstName,String lastName, int age) {
        fullName.firstName = firstName;
        fullName.lastName=lastName;
        this.age = age;
    }


    public String info() {
        return "Person{" +
                "firstName=" + fullName.firstName +
                "lastName=" + fullName.lastName +
                ", age=" + age +
                '}';
    }
    public abstract String activiti();



        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

    public class FullName implements Cloneable {
        private String firstName;
        private String lastName;

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

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

}


