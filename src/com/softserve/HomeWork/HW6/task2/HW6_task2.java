package com.softserve.HomeWork.HW6.task2;

import com.softserve.HomeWork.HW6.task2.Class.Developer;
import com.softserve.HomeWork.HW6.task2.Class.Employee;

public class HW6_task2 {
    public static void main(String[] args) {
        Developer d = new Developer("Oleg", 30, "Average Java developer", 100.1);
        Employee e = new Employee("Maria", 18, 20.96);

        System.out.println(d.report());
        System.out.println(e.report());
    }
}
