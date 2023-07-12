package com.softserve.practicals.p8.task1;
/*
Create a class called Department that contains a name field of String type and an address field of Address type.
In the Department class, create an inner class called Address with has city and street fields of String type and building field of type int.
In main() method, create an instance for one department and initialize it.
Then, create one more department by cloning previously created department and change the city for this object.
Output information about all departments to the console.

Створіть клас під назвою Department, який містить поле імені типу String і поле адреси типу Address.
У класі Department створіть внутрішній клас під назвою Address із полями city та street типу String і полем building типу int.
У методі main() створіть екземпляр для одного відділу та ініціалізуйте його.
Потім створіть ще один відділ, клонувавши раніше створений відділ, і змініть місто для цього об'єкта.
Вивести інформацію про всі відділи на консоль.

 */


public class App {
    public static void main(String[] args) {

        Department.Address address1 = new Department().new Address("Lviv", "Shevchenko", 10);
        Department department1 = new Department("Department 1", address1);

        Department department2 = (Department) department1.clone();
        department2.getAddress().setCity("Ivano-Frankivsk");
        Department department = department2.setName( "2" );

        System.out.println(department1);
        System.out.println("\n" + department2);
    }
}