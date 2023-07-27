package com.softserve.HomeWork.HW8.task2;

import com.softserve.HomeWork.HW8.task1.Class.Person;
import com.softserve.HomeWork.HW8.task2.Class.Student;

public class HW8_task2 {
    public static void main(String[] args) {

        Student s1 = new Student("Sasha", "Shevchenko", 19, 2);
        Student s2 = new Student("Olga", "Boyko", 18, 1);
        getInfoActivity(s1, s2);
    }

    public static void getInfoActivity(Person... people) {
        for (Person person : people) {
            System.out.println(person.info() + "\n\t" + person.activity());
        }
    }
}
