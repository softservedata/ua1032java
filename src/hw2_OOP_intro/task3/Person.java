package hw2_OOP_intro.task3;

import java.util.Scanner;
public class Person {
    private String firsName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firsName, String lastNam, int birthYear) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public static int getAge(){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        return 2023 - age;
    }

    public static String input(){
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        return input;
    }

    @Override
    public String toString() {
        return "Person " +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear;
    }

    public static void main (String[] args){

        Person person1 = new Person();

        System.out.println("Enter first person first name : ");
        person1.firsName = Person.input();
        System.out.println("second name : ");
        person1.lastName = Person.input();
        System.out.println("Birth year : ");
        person1.birthYear = getAge();

        Person person2 = new Person();

        System.out.println("Enter second person first name : ");
        person2.firsName = Person.input();
        System.out.println("second name : ");
        person2.lastName = Person.input();
        System.out.println("Birth year : ");
        person2.birthYear = getAge();

        Person person3 = new Person();

        System.out.println("Enter third person first name : ");
        person3.firsName = Person.input();
        System.out.println("second name : ");
        person3.lastName = Person.input();
        System.out.println("Birth year : ");
        person3.birthYear = getAge();

        Person person4 = new Person();

        System.out.println("Enter fourth person first name : ");
        person4.firsName = Person.input();
        System.out.println("second name : ");
        person4.lastName = Person.input();
        System.out.println("Birth year : ");
        person4.birthYear = getAge();

        Person person5 = new Person();

        System.out.println("Enter fifth person first name : ");
        person5.firsName = Person.input();
        System.out.println("second name : ");
        person5.lastName = Person.input();
        System.out.println("Birth year : ");
        person5.birthYear = getAge();

        //instead method "output"
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);

    }

}
