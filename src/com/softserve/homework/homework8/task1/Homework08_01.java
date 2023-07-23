package com.softserve.homework.homework8.task1;

public class Homework08_01 {
    // TODO: Create a FullName class with the firstName and lastName fields of type String, which
    //      would correspond to the principle of encapsulation.
    //      - Create an abstract Person class with fullName field of type FullName and age of type int.
    //      - In the Person class, create:
    //      - a constructor public Person(FullName fullName, int age) ;
    //      - info() method, which will return a string in the format
    //          "First name: <firstName>, Last name: <lastName>, Age: <age>"
    //      - an abstract public activity() method with a String return type.

    public static void main(String[] args) {
        Person[] people = {
                new Person(new FullName("Ivan", "Franko"), 32) {
                    @Override
                    public String activity() {
                        return "I'm writing a poem!";
                    }
                },
                new Person(new FullName("Oleg", "Derevo"), 19) {
                    @Override
                    public String activity() {
                        return "I'm cleaning my room!";
                    }
                },
                new Person("Andriy", "Shevchenko", 46) {
                    @Override
                    public String activity() {
                        return "I'm playing a football!";
                    }
                }
        };

        for(Person person: people){
            System.out.println(person.info());
            System.out.println(person.activity());
            System.out.println();
        }
    }
}
