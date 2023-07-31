package hm12;

import java.util.Scanner;

public class task01 {
    public static class DivisionCalculator{
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("enter first number:");
                double num1 = scanner.nextDouble();

                System.out.print("enter second number:");
                double num2 = scanner.nextDouble();

                double result = div(num1, num2);

                System.out.print("result of division:" +result);
            }catch (ArithmeticException e){


                    System.out.print("Error: Division by zero is not allowed.");

            } catch (Exception e) {
                System.out.print("Error: Invalid input. Please enter valid numbers.");
            } finally {
                scanner.close();
                }
            }
        private static double div(double num1, double num2) {
            if (num2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return num1 / num2;
        }
    }
    }
