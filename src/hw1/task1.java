package hw1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Enter the radius : ");
        Scanner scan = new Scanner(System.in);
        double radius = scan.nextDouble();
        double area = Math.pow(radius, 2) * Math.PI;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
