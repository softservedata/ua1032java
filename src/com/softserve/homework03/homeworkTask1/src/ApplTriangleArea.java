import java.util.Scanner;
    public class ApplTriangleArea {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input side1: ");
            double side1 = scanner.nextDouble();

            System.out.println("Input side2: ");
            double side2 = scanner.nextDouble();

            System.out.println("Input side3: ");
            double side3 = scanner.nextDouble();

            Triangle triangle = new Triangle(side1, side2, side3);
            double area = triangle.calculateArea();

            System.out.print("Area is: ");
            System.out.printf("%4.2f", area);
        }
    }

