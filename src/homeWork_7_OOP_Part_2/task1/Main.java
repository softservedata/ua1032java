package homeWork_7_OOP_Part_2.task1;

import java.util.Arrays;

public class Main {
    public static void  main(String[] args) {

        Employee [] employees = {new SalariedEmployee("124","Roman", 100000),
                                 new SalariedEmployee("242","Oleh", 11000),
                                 new SalariedEmployee("342","Igor", 12000),
                new ContractEmployee("142","Taras",140,90),
                new ContractEmployee("242","Ira",180,80),
                new ContractEmployee("3424","Petro",160,70),
        };
        System.out.println(Arrays.toString(employees));
        System.out.println("\n");

        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));







    }
}
