package com.softserve.edu.task;
import java.util.Scanner;
public class Task02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        double firstNumber = sc.nextDouble();
        System.out.print("Input second number: ");
        double secondNumber = sc.nextDouble();
        System.out.print("Input third number: ");
        double thirdNumber = sc.nextDouble();
        double average = ((firstNumber + secondNumber + thirdNumber)/3);
        System.out.print("Result:" + " " + average);

        sc.close();



    }
}
