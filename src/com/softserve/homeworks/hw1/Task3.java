package com.softserve.homeworks.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Cost per minute of the 1st call($): ");
        double c1 = Double.parseDouble(br.readLine());
        System.out.println("Cost per minute of the 2nd call($): ");
        double c2 = Double.parseDouble(br.readLine());
        System.out.println("Cost per minute of the 3rd call($): ");
        double c3 = Double.parseDouble(br.readLine());

        System.out.println("Duration of the 1st call(sec): ");
        double t1 = Double.parseDouble(br.readLine());
        System.out.println("Duration of the 2nd call(sec): ");
        double t2 = Double.parseDouble(br.readLine());
        System.out.println("Duration of the 3rd call(sec): ");
        double t3 = Double.parseDouble(br.readLine());
        double a = t1*c1/60;
        double b = t2*c2/60;
        double c = t3*c3/60;
        System.out.println("Cost of the 1st call: " + a);
        System.out.println("Cost of the 2nd call: " + b);
        System.out.println("Cost of the 3rd call: " + c);
        System.out.println("Total cost of 3 calls: " + (a+b+c));
        /*
         System.out.println("Cost of the 1st call: " + t1*c1/60);
        System.out.println("Cost of the 2nd call: " + t2*c2/60);
        System.out.println("Cost of the 3rd call: " + t3*c3/60);
        System.out.println("Total cost of 3 calls: " + ((t1*c1/60) + (t2*c2/60) + (t3*c3/60)));
         */



    }
}