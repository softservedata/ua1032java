package com.softserve.edu.Homeworks1;
import java.util.Scanner;
import java.lang.Math;
public class Homework01 {
    public static void main(String[] args) {
        System.out.println("The program which calculates " +
                "perimeter and area of the circle");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        int r = scan.nextInt();
        double A = Math.PI * r; //area of the circle is pi*r
        double P = 2*Math.PI*r; //perimeter of the circle is 2*pi*r

        System.out.printf("Area of the circle: %,.3f \n", A);
        System.out.printf("Perimeter of the circle %,.3f \n", P);
    }
}
