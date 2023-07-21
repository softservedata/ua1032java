package com.softserve.Practical.P8;

import com.softserve.HomeWork.HW8.task1.Class.Person;
import com.softserve.Practical.P8.Class.Department;

public class P8_task1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department d1 = new Department("Department1", "Lviv", "Bandera", 14 );
        Department d2 = (Department) d1.clone();

//        d2.setCity("Kyiv");
        d2.setName("Department2");
        d2.setAddress(new Department.Address("Kyiv", "Khreshchatyk", 1));

        System.out.println(d1);
        System.out.println(d2);

    }
}
