package hm03;

import java.util.Scanner;

public class task03 {

    static class Person {
        private String firstName;
        private String lastName;
        private int birthYear;

        public Person() {

        }

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public int getAge() {
            int currentYear = java.time.Year.now().getValue();
            return currentYear - birthYear;
        }
            public void input() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter name: ");
                firstName = scanner.nextLine();
                System.out.print("Enter lastName: ");
                lastName = scanner.nextLine();
                System.out.print("Enter birth year: ");
                birthYear = scanner.nextInt();
            }

            public void output() {
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Birth Year: " + birthYear);
                System.out.println("Age: " + getAge());
            }

            public void changeName(String fn, String ln) {
                firstName = fn;
                lastName = ln;
            }
        }


    public static void main(String[] args) {
        Person[] people = new Person[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter information for person " + (i + 1) + ":");
            Person person = new Person();
            person.input();
            people[i] = person;
        }
        System.out.println("\nInformation about the people:");
        for (Person person : people) {
            person.output();
            System.out.println();
        }
    }
}