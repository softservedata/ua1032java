package com.softserve.HW5.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW5_task2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        String choice;
        do{
            System.out.print("First number: ");
            int a = Integer.parseInt(br.readLine());
            System.out.print("Second number: ");
            int b = Integer.parseInt(br.readLine());

            int sum= a+b;
            total += sum;

            System.out.println("Total: "+total);
            System.out.println(a + " + " + b+ " = "+sum);

            System.out.println("Do you want to continue?(Yes/No)");
            choice  = br.readLine();

            choice =choice.toLowerCase();                        //
            choice = choice.replace(" ", "");   //

        }while(choice.equals("yes"));
    }
}
