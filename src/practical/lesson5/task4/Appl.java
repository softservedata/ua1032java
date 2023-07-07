package practical.lesson5.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Appl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        Employee [] employees= new Employee[5];
        employees[0] = new Employee("Ivan", 12, 5000);
        employees[1] = new Employee("Petro", 12, 7000);
        employees[2]= new Employee("Taras", 17, 50000);
        employees[3]= new Employee("Roman", 13, 12000);
        employees[4]= new Employee("Yuriy", 14, 17000);

        System.out.print("Input department number: ");
        int input = Integer.parseInt(br.readLine());
        System.out.println("\nEmployees from department " + input + ":");
        for(int i=0; i < employees.length; i++){
            if (employees[i].getDepartmentNumber()==input){
                System.out.println(employees[i].toString());
            }
        }

        System.out.println("\nUnsorted employees: ");
        for(int i=0; i < employees.length; i++){
            System.out.println(employees[i].toString());
        }

        Employee temp = new Employee();
        for (int i = 0; i<employees.length-1; i++){
            for (int j = i+1; j<employees.length; j++){
                if (employees[i].getSalary()<employees[j].getSalary()){
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        System.out.println("\nSorted by salary (descending) employees: ");
        for(int i=0; i < employees.length; i++){
            System.out.println(employees[i].toString());
        }

    }
}
