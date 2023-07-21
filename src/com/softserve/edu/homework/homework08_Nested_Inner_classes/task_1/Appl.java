package com.softserve.edu.homework.homework08_Nested_Inner_classes.task_1;
public class Appl {
    public static void main (String[] args){
        Person[] persons = new Person[3];
        persons[0] = new Person(new FullName("Thomas", "Smith"), 32) {
            @Override
            public String activity() {
                return null;
            }
        };
        persons[1] = new Person(new FullName("Amelia", "Brown"), 20) {
            @Override
            public String activity() {
                return null;
            }
        };
        persons[2] = new Person(new FullName("Ronnie", "Coleman"), 59) {
            @Override
            public String activity() {
                return null;
            }
        };
        for (Person person : persons) {
            System.out.println(person.info());
        }
    }
}
