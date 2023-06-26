package com.softserve.homework01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class homeworkTask3 {
    private static final DecimalFormat decfor = new DecimalFormat("0.00");

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the cost per minute of each call:");

        double c1 = Double.parseDouble(br.readLine());
        double c2 = Double.parseDouble(br.readLine());
        double c3 = Double.parseDouble(br.readLine());

        System.out.println("Enter the duration of each call:");

        double t1 = Double.parseDouble(br.readLine());
        double t2 = Double.parseDouble(br.readLine());
        double t3 = Double.parseDouble(br.readLine());


        double totalCostFor1 = c1 * t1;
        double totalCostFor2 = c2 * t2;
        double totalCostFor3 = c3 * t3;


        System.out.println("The total cost of the first call = " + decfor.format(totalCostFor1));
        System.out.println("The total cost of the second call = " + decfor.format(totalCostFor2));
        System.out.println("The total cost of the 1third call = " + decfor.format(totalCostFor3));

    }
}
