package com.softserve.homework.hw09.hw12.task1;
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
        } catch (ArithmeticException | NumberFormatException exception) { // ArithmeticException  якщо вводимо 0
            System.err.println( "Exception was found: " + exception );
        } catch (Exception exception) {
            exception.printStackTrace( );
            /*
            Якоїсь ви хочете вивести інформацію про виключення в консоль, то пишіть e.printStackTrace(),
            адже це виводить більш повну інформацію, ніж System.err.println(e.getMessage()).

            printStackTrace виводить відразу три речі:
                 назва класу виключення,
                     повідомлення (message якщо воно є, тобто не дорівнює null)
                         і stack trace.
                             Це більш громіздко, але саме для діагностики краще
         */
        }
        return 0;
    }

    public static void main ( String[] args ) {
        double num1 = 12.36;
        double num2 = 7.68;
        System.out.println( div( num1, num2 ) );
    }
}
