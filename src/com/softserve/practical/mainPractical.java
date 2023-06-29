package com.softserve.practical;

import com.softserve.practical.practicalTask_3.TaskOneCalculate;
import com.softserve.practical.practicalTask_3.TaskTwoEmployee;

public class mainPractical {
    public static void main(String[] args) {
//        TaskOneCalculate ts = new TaskOneCalculate(52,63);
//        System.out.println(ts.getTotal());
//        System.out.println(ts.getAverage());
//        System.out.println(TaskOneCalculate.getNumber("895"));
        TaskTwoEmployee employee1 = new TaskTwoEmployee("employee1", 200, 5);
        TaskTwoEmployee employee2 = new TaskTwoEmployee("employee2", 300, 4);
        TaskTwoEmployee employee3 = new TaskTwoEmployee("employee3", 600, 2);
        System.out.println("Total amount: " + (employee1.getSalary() + employee2.getSalary() + employee3.getSalary()));

    }
}
