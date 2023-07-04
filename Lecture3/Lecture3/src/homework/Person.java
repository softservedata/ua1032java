package homework;

import java.util.Scanner;

public class Person {
    private static String firstName;
    private static String lastName;
    private static int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setFirstName(String firstName) {
        Person.firstName = firstName;
    }

    public void setLastName(String lastName) {
        Person.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        Person.birthYear = birthYear;
    }

    public  int getAge() {
        // return 2023 - birthYear;
        int curYear = java.time.Year.now().getValue();
        return curYear - birthYear;
    }

   public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your First name: ");
        this.firstName = scanner.nextLine();
        System.out.println("Input your Second name: ");
        this.lastName = scanner.nextLine();
        System.out.println("Input your birth year: ");
        this.birthYear = scanner.nextInt();
        scanner.nextLine();
    }

    public void output() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Birth year: " + birthYear);
        System.out.println("Age: " + getAge());
    }

    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
