package com.softserve.practical.practicalHW_7;

import com.softserve.practical.practicalHW_6.task2Car.Car;
import com.softserve.practical.practicalHW_7.task1.Animal;
import com.softserve.practical.practicalHW_7.task1.Cat;
import com.softserve.practical.practicalHW_7.task1.Dog;
import com.softserve.practical.practicalHW_7.task2.*;

public class mainPractical_7 {
    public static void main(String[] args) {
/**--------------------Task1---------------------------*/
//        Animal[] a = new Animal[4];
//        a[0] = new Cat();
//        a[1] = new Cat();
//        a[2] = new Dog();
//        a[3] = new Dog();
//        for (Animal animals : a) {
//            animals.feed();
//            animals.voice();
//        }
/**--------------------Task2---------------------------*/
        Person [] people = new Person[5];
        people[0] = new Cleaner("Jana",1000);
        people[1] = new Teacher("Dan",5000);
        people[2] = new Student("Jake");
        people[3] = new Teacher("Mart",5005);
        people[4] = new Cleaner("Varen",800);
        for (Person persons:people) {
            System.out.println(persons.print());
            System.out.println(persons.getSalary());
        }
    }
}
