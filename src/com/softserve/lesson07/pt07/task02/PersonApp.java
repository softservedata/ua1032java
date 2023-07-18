package com.softserve.lesson07.pt07.task02;

public class PersonApp {
    public static void main(String[] args) {
        Person[] persons = {new Student(), new Teacher(), new Cleaner(), new Teacher(), new Student(), new Cleaner()};
        persons[0].setName("Mary");
        persons[1].setName("Mr. Norton");
        persons[2].setName("Mrs. Morrison");
        persons[3].setName("Ms. Davidson");
        persons[4].setName("Steven");
        persons[5].setName("Mr. Smith");

        for (Person list:persons) {
            list.print();
            System.out.println(" " + list.getName());
        }

        for (Person list:persons) {
            if (list instanceof Staff) {
                ((Staff) list).salary();
                System.out.println(" " + list.getName());
            }
        }
    }
}
