package com.softserve.Practical.P1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        //TASK 1
        System.out.println("Task 1");
        System.out.println("==========================");
        System.out.println("Input Text: ");

        String a1 = br.readLine();
        String b1 = br.readLine();
        String c1 = br.readLine();

        System.out.println("-------------------------");
        System.out.println("First text: "+a1);
        System.out.println("Second text: "+b1);
        System.out.println("Third text: "+c1);

        //TASK 2
        System.out.println("Task 2");
        System.out.println("==========================");
        System.out.println("Input Number: ");

        double a2= Double.parseDouble(br.readLine());
        double b2= Double.parseDouble(br.readLine());
        double c2= Double.parseDouble(br.readLine());

        double average = (a2+b2+c2)/3;

        System.out.println("Average: "+ average);
*/
        //TASK 3

        System.out.println("First number: ");
        int a3 = Integer.parseInt(br.readLine());

        System.out.println("Arithmetic operators(+-*/): ");
        String str = br.readLine();
        System.out.println("Second number: ");
        int b3 = Integer.parseInt(br.readLine());
        if(str.contains("+")){
            System.out.println(a3+" + "+b3+" = " +(a3+b3));
        }
        if(str.contains("-")){
            System.out.println(a3+" - "+b3+" = " + (a3-b3));
        }
        if(str.contains("*")){
            System.out.println(a3+" * "+b3+" = " +(a3*b3));
        }
        if(str.contains("/")){
            System.out.println(a3+" / "+b3+" = " + (a3/b3));
            System.out.println("Remainder: "+a3%b3);
        }
        //TASK4

        System.out.println("How are you? ");
        String answer = br.readLine();

        System.out.println("You are "+ answer);


        br.close();
    }
}
