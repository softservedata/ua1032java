package com.softserve.edu.JavaIntroduction;
import java.util.Scanner;
public class Homework03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] costpermin = new double[3];
        for (int i = 0; i != costpermin.length; i++) {
            System.out.print("Write the cost of a phone call per minute c"+i+": ");
            double c = scan.nextDouble();
            costpermin[i] = c;
        }
        int[] durtime = new int[3];
        for (int i = 0; i != durtime.length; i++) {
            System.out.print("Write the duration of speaking on the phone t"+i+": ");
            int t = scan.nextInt();
            durtime[i] = t;
        }
        double total_cost = 0;
        for (int i = 0; i != costpermin.length; i++) {
            System.out.println("Duration: " + durtime[i] + " Cost per minute: " + costpermin[i]+"$");
            System.out.println("It will be: " + durtime[i] * costpermin[i]+"$");
            total_cost +=  durtime[i] * costpermin[i];
        }
        System.out.println("Total cost: " + total_cost + "$");
    }
}
