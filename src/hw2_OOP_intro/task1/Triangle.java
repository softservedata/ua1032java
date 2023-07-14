package hw2_OOP_intro.task1;

import java.util.Scanner;

public class Triangle {

    private double side1;
    private double side2;
    private double side3;
    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public static double triangle (double side1, double side2, double side3){

        //using Heron's formula
        //count p
        double p = 0.5 * (side1 + side2 + side3);

        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));

    }

    public static void main (String[] args){

        double sum;
        Scanner scan = new Scanner(System.in);

        Triangle triangle = new Triangle();

        System.out.println("Input Side 1: ");
        double side1 = scan.nextDouble();

        System.out.println("Input Side 2: ");
        double side2 = scan.nextDouble();

        System.out.println("Input Side 3: ");
        double side3 = scan.nextDouble();

        sum = triangle(side1, side2, side3);

        double roundOff = Math.round(sum * 100.0) / 100.0;

        System.out.println("The area of the triangle is : " + roundOff);

    }



}
