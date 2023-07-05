package com.softserve.edu.homework.homework5_arrays_loops.task_2;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Do_While {
    public static void main (String[] args)throws IOException {
        Scanner input = new Scanner(System.in);
        String again;
        do {
            System.out.print("Enter first number : ");
            double x = Double.parseDouble(input.nextLine());
            System.out.print("Enter second number : ");
            double y = Double.parseDouble(input.nextLine());
            System.out.println("Sum : " + (x+y));
            System.out.println("Do you want to perform the operation again ? (Yes/No)  ");
            again = input.nextLine();
        }while(Objects.equals(again, "Yes"));
    }
}