package com.softserve.HomeWork.HW12.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW12_task1 {
    public static Scanner sc = new Scanner(System.in);

    public static double div(double a, double b){
        if (b == 0){
            throw new ArithmeticException("Division by zero.");
        }
        return a/b;
    }
    public static void main(String[] args) {
        double a, b;
        try {
            a = sc.nextDouble();
            b = sc.nextDouble();
            double result = div(a,b);
        }catch (ArithmeticException e){
            System.err.println(e.getMessage());
        }catch (NullPointerException e) {
            System.err.println("No values entered!");
        }catch (NumberFormatException e){
            System.err.println("NumberFormatException");
        } catch (InputMismatchException e){
            System.err.println("InputMismatchException");
        } catch (Exception e) {
            System.err.println("Unknown error: ");
        }

    }
}
