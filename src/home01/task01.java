package home01;

import java.util.Scanner;

public class task01 {

    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the flower bed:");
        double radius= scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The perimeter of the flower bed: " + perimeter);
        System.out.println("The area of the flower bed: " + area);

    }
}

