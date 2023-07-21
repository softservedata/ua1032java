package com.softserve.edu.practical.Practical_tasks_01_Java_core_introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.util. Objects;
import java.io.InputStreamReader;
public class Task_3 {
    private double x;
    private double y;
    private String sign;
    public static void main(String[]args)throws IOException {
        BufferedReader math = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter x : ");  double x = Double.parseDouble(math.readLine());
        System.out.println("Enter y : ");  double y = Double.parseDouble(math.readLine());

        System.out.println("Select a sign :  \n+ \n- \n* \n/ \n% ");
        String sign = math.readLine();
        if(Objects.equals (sign, "+")){
            System.out.println(" ( x + y )  :   " + (x+y));
        }
        else if (Objects.equals (sign, "-")){
            System.out.println(" ( x - y )  :   " + (x-y));
        }
        else if (Objects.equals (sign, "*")){
            System.out.println(" ( x * y )  :   " + (x*y));
        }
        else if (Objects.equals (sign, "/")){
            System.out.println(" ( x / y )  :   " + (x/y));
        }
        else if (Objects.equals (sign, "%")){
            System.out.println(" ( x % y )  :   " + (x%y));
        }
        else {System.out.println("ERROR");}
    }
}
