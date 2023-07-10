package com.softserve.homework.hw06.task2;
/*
Create a class called Developer that extends the Employee class.
Define a String field and a constructor to initialize all fields in the Developer class.
In the Developer class, override the report() method to return a string with information about the developer, for example:
Name: Taras, Age: 32 years, Position: Average Java developer, Salary: 32735.35
If necessary, modify the Employee class to adhere to the principles of encapsulation and inheritance.
In main() method create an instance of both the Employee and Developer classes and print information about them  in the console using report() method.

Створіть клас під назвою Developer, який розширює клас Employee.
Визначте поле String і конструктор для ініціалізації всіх полів у класі Developer.
У класі Developer замініть метод report(), щоб повернути рядок з інформацією про розробника, наприклад:
Ім'я: Тарас, Вік: 32 роки, Посада: Середній Java-розробник, Зарплата: 32735.35
Якщо необхідно, змініть клас Employee, щоб дотримуватися принципів інкапсуляції та успадкування.
У методі main() створіть екземпляр класів Employee і Developer і роздрукуйте інформацію про них у консолі за допомогою методу report().
 */

public class App {
    public static void main(String[] arg) {

        Developer developer = new Developer( "Taras", 32, 32735.35, "Average Java developer" );
        System.out.println(developer.report());

        Employee employee = new Employee( "Ivan", 42, 64352.25 );
        System.out.println(employee.report());
    }
}