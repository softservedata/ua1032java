package com.softserve.homework.homework12.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework12_01 {
    // TODO: Create div() method, which calculates the dividing of two double type numbers. In main()
    //      method input 2 double numbers and call this method. Catch all exceptions.
//при діленні даблів на 0, буде безкінечність, тому там немає як такого арифметичного вийнятку.
    //подумай про це
    public static double div(double a, double b) throws ArithmeticException {
        if(b == 0) throw new ArithmeticException("Division by zero isn't allowed!");
        return a / b;
    }

    public static void main(String[] args) {
        double a;
        double b;
        double result;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            a = sc.nextDouble();
            System.out.print("Enter second number: ");
            b = sc.nextDouble();
            result = div(a, b);
            System.out.println(result);
        } catch (InputMismatchException e){
            System.err.println("Invalid value!");
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("No values entered!");
        }
    }
}
