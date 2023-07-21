package com.softserve.Practical.P7.task2;

import com.softserve.Practical.P7.task2.Class.*;

public class P7_task2 {
    public static void main(String[] args) {
        Person[] array = {
                new Teacher("Olga",150),
                new Teacher("Taras", 110),

                new Cleaner("Anastasia", 100),

                new Student("Oleg"),
                new Student("Shasha"),
                new Student("Ira"),

                new Staff("Ostap", 200)
        };
        print(array);
        System.out.println("-----------------------");
        getSalary(array);

    }
    public static void print(Person... people){
        for (Person person: people){
            person.print();
        }
    }
    public static void getSalary(Person... people){
        for (Person person: people){
            if (person instanceof Staff){
                System.out.println( person.getName() + " have $" +((Staff) person).getSalary());
            }
        }
    }
}
