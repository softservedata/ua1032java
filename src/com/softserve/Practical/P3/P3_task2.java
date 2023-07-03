package com.softserve.Practical.P3;

import java.io.IOException;
public class P3_task2 {
    public static void main(String[] args)throws IOException {
        Employee e1 = new Employee("Oleg",100,10);
        Employee e2 = new Employee("Maria",200,10);
        Employee e3 = new Employee();

        e1.setRate(20);
        e3.input();
        e2.getBonus(10);

        System.out.println(e1.getTotalSum());
    }

}
