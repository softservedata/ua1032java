package homework.lesson12.task1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideDouble {
    public static double div(double a, double b) throws ArithmeticException {
        if (b == 0)
            throw new ArithmeticException();
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;

        try {
            System.out.print("Input a: ");
            a = sc.nextDouble();
            if (a < 0)
                throw new InputMismatchException();

            System.out.print("Input b: ");
            b = sc.nextDouble();
            if (b < 0)
                throw new InputMismatchException();
            System.out.println("Result: " + div(a, b));

        } catch (InputMismatchException e) {
            System.err.println("Wrong a or b!");
        } catch (ArithmeticException e) {
            System.err.println("Division by zero!");
        }


    }
}

