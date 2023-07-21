package com.softserve.edu.practical.Practical_tasks_04_condition_statements.task_1;

import java.io.IOException;
import java.util.Scanner;
public class Even_or_odd {
    public static void main(String[]args) throws IOException {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];

        for(int i = 0; i < numbers.length ; i++){
            System.out.print("Enter a " + (i+1) + " number :" );
            numbers[i] = Integer.parseInt(input.nextLine());
        }
        int  how_many = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                how_many++;
            }
        }
        System.out.println("Number of even numbers : "+how_many);
    }
}
