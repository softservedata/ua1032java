package com.softserve.HW7.task1;

import com.softserve.HW7.task1.Class.ContractEmployee;
import com.softserve.HW7.task1.Class.Employee;
import com.softserve.HW7.task1.Class.SalariedEmployee;

import java.util.Arrays;

public class HW7_task1 {
    public static void main(String[] args) {
        Employee[] company = {
                new SalariedEmployee("Oleg","id0001",1000.99,"as1232"),
                new SalariedEmployee("John","id1000",2000.01,"ba1232"),
                new SalariedEmployee("Tom","id2000",999,"gg2280"),
                new SalariedEmployee("Maria","id2222",100.1,"oo0000"),

                new ContractEmployee("Oleg","id1234",10,150,"228001"),
                new ContractEmployee("Anastasia","id9911",18,100,"10000"),
                new ContractEmployee("Olga","id007", 20,168,"000000"),
                new ContractEmployee("Nadia","id9999", 11,111,"111111")
        };
        System.out.println("Origin array: " + Arrays.toString(company));
        Arrays.sort(company);
        System.out.println("Sorted array: " + Arrays.toString(company));
    }

}
