package com.softserve.hw01.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTask {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Flower bed radius is:");
        double radius = Float.parseFloat(bufferedReader.readLine());
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Flower bed perimeter is: " + perimeter);
        System.out.println("Flower bed area is: " + area);

        System.out.println("What is your name?");
        String name = bufferedReader.readLine();
        System.out.println("Where do you live " + name + "?");
        String address = bufferedReader.readLine();
        System.out.println("Your name is " + name + ". You live in " + address + ".");

        System.out.println("Cost per minute of first call:");
        float c1 = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Duration of first call:");
        int t1 = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Cost per minute of second call:");
        float c2 = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Duration of second call:");
        int t2 = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Cost per minute of third call:");
        float c3 = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Duration of third call:");
        int t3 = Integer.parseInt(bufferedReader.readLine());
        float cost1 = (c1*t1);
        float cost2 = (c2*t2);
        float cost3 = (c3*t3);
        System.out.println("Cost of first call: " + cost1);
        System.out.println("Cost of second call: " + cost2);
        System.out.println("Cost of third call: " + cost3);
        System.out.println("Total cost: " + (cost1+cost2+cost3));

    }
}

