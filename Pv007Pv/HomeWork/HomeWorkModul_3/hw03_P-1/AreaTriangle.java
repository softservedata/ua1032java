/**1. Java console application with method to calculate the area of a triangle. */
import java.util.Scanner;

public class AreaTriangle {
    /*
    The AreaTriangleHeron method returns the area of
    a triangle on three sides using
    Heron's formula : S = sqrt(p * (p - a) * (p - b) * (p - c)), (p = (a + b + c) / 2) .
    */
    public static double  AreaTriangleHeron (double a, double b, double c) {
        return Math.sqrt((a + b + c) / 2 * (((a + b + c) / 2) - a)
                * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
    }

    public static void main (String [] args) {
        // Creating a Scanner object for reading input from the console.
        Scanner input = new Scanner(System.in);
        System.out.println("Input Side 1 ");
        // Reading the entered value of the first side of the triangle
        int t1 = Integer.parseInt(input.nextLine());
        System.out.println("Input Side 2 ");
        // Reading the entered value of the second side of the triangle
        int t2 = Integer.parseInt(input.nextLine());
        System.out.println("Input Side 3 ");
        // Reading the entered value of the third side of the triangle
        int t3 = Integer.parseInt(input.nextLine());

        // outputting the area of the triangle
        System.out.printf("The area of the triangle is " + "%.2f%n",AreaTriangleHeron (t1,t2,t3));
    }
}
