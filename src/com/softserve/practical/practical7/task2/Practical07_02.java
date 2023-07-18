package com.softserve.practical.practical7.task2;

public class Practical07_02 {
    // TODO: Realize next structure of classes. In abstract class
    //      Person with property name, declare abstract
    //      method print(). In other extended classes in body of
    //      method print() output text “I am a …”. In class Staff
    //      declare abstract method salary(). In each concrete
    //      class create constant TYPE_PERSON. Output type of
    //      person in each constructors. In main() method
    //      create an array of Person and add some Teachers,
    //      Cleaners and Students. Call method print() for all of
    //      it. Call method salary() for all Teachers and Cleaners.

    public static void main(String[] args) {
        Person[] people = {
                new Cleaner(8200),
                new Student(),
                new Teacher(12000)
        };

        System.out.println();
        for(Person person: people){
            System.out.println(person);
            person.print();
            if(person instanceof Staff){
                ((Staff) person).salary();
            }
        }
    }
}
