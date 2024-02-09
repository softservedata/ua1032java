package com.softserve.edu.practical.Practical_tasks_07_OOP_Interfaces_Polymorphism.task_2;

public class Appl {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Teacher("Sigma");
        persons[1] = new Student("Lev");
        persons[2] = new Cleaner("Max");


        for(Person person : persons ){
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
        }



    }
}
