package com.softserve.edu.practical.Practical_tasks_05_arrays_loops.task_2;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean primeNumber(int number){
        for(int i = 2; i < number/2 ; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter int number:");

        try{
            number = scanner.nextInt();
        } catch (Exception e){
            System.out.println("Input INT number");
            return;
        }
        if(primeNumber(number)){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number isn't prime");
        }
    }
}
