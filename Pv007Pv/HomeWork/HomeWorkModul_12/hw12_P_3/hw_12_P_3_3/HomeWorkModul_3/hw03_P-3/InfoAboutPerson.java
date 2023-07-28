package hw12_P_3.hw_12_P_3_3.HomeWorkModul_3.hw03_P-3;

/** 3*. Create Console Application and add class called Person to the project. Class Person should consist of:
 • three private fields: firstName, lastName and birthYear (the birthday year);
 • properties for access to these fields;
 • default constructor and constructor with 2 parameters (first and last names);
 • Methods:
 • (**) getAge() - to calculate the age of a person;
 • input() - to input information about the person;
 • output() - to output information about the person;
 • changeName(String fn, String ln) - to change the first name or/and last name.
 In the main() method create 5 objects of Person type and input information about them to console.*/

public class InfoAboutPerson {
    public static void main(String[] args) {
    // Creating 5 objects
    Person person1 = new Person("Ilon", "Mask");
        Person person2 = new Person("Ada", "Leibnitz");
            Person person3 = new Person("Yaroslav", "Boyko",1980);
                Person person4 = new Person("Ivan", "Matiy", 1984);
                    Person person5 = new Person("Oleg", "Tesla", 1986);

        //Outputing information about 5 person.
        System.out.println("----------------------------------");
        System.out.println(person1.output());
        System.out.println("----------------------------------");
        System.out.println(person2.output());
        System.out.println("----------------------------------");
        System.out.println(person3.output());
        System.out.println("----------------------------------");
        System.out.println(person4.output());
        System.out.println("----------------------------------");
        System.out.println(person5.output());
        System.out.println("----------------------------------");
    }
}
