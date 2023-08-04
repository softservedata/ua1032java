package com.softserve.edu.IntroductionToOOP;

import java.lang.Math;
import java.util.Scanner;
// Don't forget to format your code before commit
public class AreaOfTriangle { //Class name must be informative

    public static double CalcArea(double a, double b, double c) {
        double p, A;
        p = (a + b + c) / 2; //half of perimeter
        A = Math.sqrt(p * (p - a) * (p - b) * (p - c)); // the Heron's formula
        return A;
    }

    public static void main(String[] args) {
        double a, b, c;
        Scanner scan = new Scanner(System.in);

        // Enter here a size of each sides of the triangle
        System.out.print("Side a = ");
        a = scan.nextDouble();
        System.out.print("Side b = ");
        b = scan.nextDouble();
        System.out.print("Side c = ");
        c = scan.nextDouble();

        System.out.printf("Area of the triangle: %.2f", CalcArea(a, b, c));
        scan.close(); // don't forget to close the scanner
    }

}

