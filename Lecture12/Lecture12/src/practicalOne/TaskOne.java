package practicalOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne {

    public static int squareRectangle(int a, int b) throws IllegalArgumentException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Both dimensions must be positive.");
        }
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        try {
            System.out.print("Input a: ");
            a = scanner.nextInt();
            System.out.print("Input b: ");
            b = scanner.nextInt();
            int area = squareRectangle(a, b);
            System.out.println("Reactangle area: " + area);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Try again!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}