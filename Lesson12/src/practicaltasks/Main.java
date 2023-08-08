package practicaltasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        firstPracticalTasks(scanner);

    }

    public static void firstPracticalTasks(Scanner scanner) {
        try {
            System.out.print("Input Side 1: ");
            int a = scanner.nextInt();
            System.out.print("Input Side 2: ");
            int b = scanner.nextInt();
            System.out.print("Input Side 3: ");
            int c = scanner.nextInt();
            var result=squareRectangle(a, b, c);
            System.out.println("Rectangle area: "+result);
        }catch (InputMismatchException e){
            System.out.println("Invalid input. Try again!");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    public static int squareRectangle(int a, int b, int c) throws IllegalArgumentException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Both dimensions must be positive.");
        } else {
            int result;
            int result1;
            int p;
            p = (a + b + c) / 2;
            result1 = p * (p - a) * (p - b) * (p - c);
            result = (int) Math.sqrt(result1);
            return result;
        }

    }




}