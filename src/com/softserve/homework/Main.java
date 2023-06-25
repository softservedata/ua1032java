package com.softserve.homework;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //Task 1
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the radius of the flower bed: ");
        double radius = Double.parseDouble(reader.readLine());
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The perimeter of the flower bed is: " + perimeter);
        System.out.println("The area of the flower bed is: " + area);


        //Task 2
        System.out.print("What is your name? ");
        String name = reader.readLine();
        System.out.print("Where do you live? ");
        String address = reader.readLine();
        System.out.println(name + " lives in " + address);


        //Task 3
        System.out.print("Enter the cost per minute for the first call: ");
        double c1 = Double.parseDouble(reader.readLine());
        System.out.print("Enter the duration of the first call: ");
        double t1 = Double.parseDouble(reader.readLine());
        double cost1 = c1 * t1;


        System.out.print("Enter the cost per minute for the second call: ");
        double c2 = Double.parseDouble(reader.readLine());
        System.out.print("Enter the duration of the second call: ");
        double t2 = Double.parseDouble(reader.readLine());
        double cost2 = c2 * t2;


        System.out.print("Enter the cost per minute for the third call: ");
        double c3 = Double.parseDouble(reader.readLine());
        System.out.print("Enter the duration of the third call: ");
        double t3 = Double.parseDouble(reader.readLine());
        double cost3 = c3 * t3;

        System.out.println("The cost of the first call is: " + cost1 +"$");
        System.out.println("The cost of the second call is: " + cost2 + "$" );
        System.out.println("The cost of the third call is: " + cost3 + "$");
        double totalCost = cost1 + cost2 + cost3;
        System.out.println("The total cost of all calls is: " + totalCost + "$" );
    }
}