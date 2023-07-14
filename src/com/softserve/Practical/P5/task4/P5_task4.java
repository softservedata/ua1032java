package com.softserve.Practical.P5.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P5_task4 {
    public static Employee[] array;

    public static void sort() {
        for (int i = 1; i < array.length; i++) {
            Employee temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].getSalary() < temp.getSalary()) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
    }
    public static List<Employee> employeeByDepartament( int departament ){
        List<Employee> list = new ArrayList();
        for (Employee temp : array){
            if (temp.getDepartmentNumber() == departament){
                list.add(temp);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int size = 6;
        array = new Employee[size];
        for (int i = 0; i < size; i++){
             array[i] = new Employee();
            array[i].input();
            System.out.println("============================");
        }

//        array[0] = new Employee("Oleg", 301,2000);
//        array[1] = new Employee("Rostyslav",228 ,3000);
//        array[2] = new Employee("Ostap", 111,1000);
//        array[3] = new Employee("Maria", 501,200);
//        array[4] = new Employee("Sofia", 228,2900);
//        array[5] = new Employee("Anastasia", 201,2000);

        sort();

        System.out.println(Arrays.toString(array));
        List<Employee> list = employeeByDepartament(228);
        System.out.println("---------------------------");
        System.out.println("\n" + list);

    }
}
