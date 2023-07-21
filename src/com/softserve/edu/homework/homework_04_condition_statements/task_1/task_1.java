package com.softserve.edu.homework.homework_04_condition_statements.task_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class task_1 {
    static boolean result;
    public static void main(String[] args) throws IOException {
        BufferedReader range = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            System.out.print("Input number : ");
            float x = Float.parseFloat(range.readLine());
            if (x < -5 || x > 5){
            result = false;
            System.out.println("this number ISN'T in the range [-5;5]");
        }
        else {
            result = true;
        System.out.println("this number IS in the range [-5;5]");}
        }
    }
}
