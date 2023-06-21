/**1. Flower bed is shaped like a circle.
 Calculate its perimeter and area. Input the radius
 from the console, and output obtained results.*/
// Import the Scanner class from the java.util package.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Creating a Scanner object for reading input from the console.
        Scanner input = new Scanner(System.in);
        // Ask the user to enter the radius of a circle.
        System.out.print("Input radius circle: " + System.lineSeparator() +"(Example 5 or 2.5): ");
        // Read the entered radius from the console and convert the string to a double data type.
        double R = Double.valueOf(input.nextLine());
        // The constant Pi.
        double PI = Math.PI;
        // Calculate the perimetr of the circle using the formula.
        double l = 2 * PI * R;
        // Calculate the area of a circle using the formula.
        double S = PI * R * R;
        // outputting the perimetr value rounded to two decimal places.
        System.out.printf("Perimetr: " + "%.2f%n", l);
        // outputting the area value rounded to two decimal places.
        System.out.printf("Area: " + "%.2f%n",S);
    }
}