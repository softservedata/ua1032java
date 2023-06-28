package homework.lesson3.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(){
        this.firstName = "-";
        this.lastName = "-";
        this.birthYear = 0;
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge(){
        if (getBirthYear() == 0) {
            return 0;
        }

        return 2023 - this.birthYear;
    }

    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("First name: ");
        this.firstName = br.readLine();
        System.out.print("First name: ");
        this.lastName = br.readLine();
        System.out.print("Birth year: ");
        this.birthYear = Integer.parseInt(br.readLine());


    }
    public void output(){
        System.out.println("--------");
        if(getAge()!=0) {
            System.out.print("First name: " + getFirstName() +
                    "\nLast name: " + getLastName() +
                    "\nAge: " + getAge() + "\n");
        }
        else{
            System.out.print("First name: " + getFirstName() +
                    "\nLast name: " + getLastName() +
                    "\n");
        }

    }
    public void changeName(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
    }
}
