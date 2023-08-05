package com.softserve.hw.lesson14;

import com.softserve.hw.lesson14.task1.Product;
import com.softserve.hw.lesson14.task2.Employee;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class mainLesson14 {
    public static void main(String[] args) {
        System.out.println("task1");
        List<Product> products = Product.createList();
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("---------------------------------------");
        List<Product> l = Product.seekProductByPriceAndYears(products);
        for (Product p : l) {
            System.out.println(p);
        }
        System.out.println("task2");
        Employee empl1 = new Employee("Bob");
        Employee empl2 = new Employee("Din");
        Employee empl3 = new Employee("Sam");
        Employee empl4 = new Employee("Sam");

        Stream<Employee> employees = Stream.of(empl1, empl2, empl3, empl4);
        Optional<String> mostPopular = Employee.mostPopularName(employees);
        mostPopular.ifPresent(name -> System.out.println("Most popular name: " + name));
    }
}
