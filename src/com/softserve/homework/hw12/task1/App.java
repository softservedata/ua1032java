package com.softserve.homework.hw12.task1;
/*
Create div() method, which calculates the dividing of two double type numbers.
In main() method input 2 double numbers and call this method.
Catch all exceptions.

Створити метод div (), який обчислює ділення двох чисел типу double.
В основний () метод вводять 2 double числа і називають цей метод.
Спіймати всі винятки.

 */

public class App {
    public static double div ( double num1, double num2 ) {
        try {
            return num1 / num2;
        } catch (ArithmeticException exception) {
            System.err.println( "Exception was found: " + exception );
        } catch (Exception exception) {
            exception.printStackTrace( );
        }
        return 0;
    }

    public static void main ( String[] args ) {
        double num1 = 12.36;
        double num2 = 7.68;
        System.out.println( div( num1, num2 ) );
    }
}
