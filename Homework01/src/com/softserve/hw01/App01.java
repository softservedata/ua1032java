package com.softserve.hw01;
import java.util.Scanner;

public class App01 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("radius = " );
        int r = sc.nextInt();
        double p = 2 * 3.14 * r;
        double a = 3.14 * r * r;
        System.out.println("perimeter = " + p);
        System.out.println("area = " + a);
    }
}
