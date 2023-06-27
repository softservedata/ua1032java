package com.softserve.edu.homework01;
import java.util.Scanner;
public class HomeWork01 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.println("Input the radius circle");
       double radius = sc.nextDouble();
       double area = Math.PI * Math.pow(radius, 2);
       double perimeter = 2 * Math.PI * radius;

       System.out.printf("Area = %.2f", area);
       System.out.printf("\nPerimeter = %.2f", perimeter);

       sc.close();


    }
}
