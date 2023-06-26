package com.softserve.hw01;
import java.util.Scanner;

public class App03 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        System.out.println("Price per minute c1 = " + c1);
        int t1 = sc.nextInt();
        System.out.println("Duration t1 = " + t1 + " minute");
        int cost_ct1 = c1 * t1;
        System.out.println("The price of the first call " + cost_ct1);
        int c2 = sc.nextInt();
        System.out.println("Price per minute c2 = " + c2);
        int t2 = sc.nextInt();
        System.out.println("Duration t2 = " + t2 + " minute");
        int cost_ct2 = c2 * t2;
        System.out.println("The price of the second call " + cost_ct2);
        int c3 = sc.nextInt();
        System.out.println("Price per minute c3 = " + c3);
        int t3 = sc.nextInt();
        System.out.println("Duration t3 = " + t3 + " minute");
        int cost_ct3 = c3 * t3;
        System.out.println("The price of the third call " + cost_ct3);
        int all_price = cost_ct1 + cost_ct2 + cost_ct3;
        System.out.println("Total price = " + all_price);




    }
}
