package com.softserve.homework.hw12.task2;
/*
Create a method readNumber(int start, int end),
that read from console integer number and return it, if it is in the range [start...end].
If an invalid number or non-number text is read, the method should throw an exception.
Using this method write a method main(), that must enter 10 numbers:
a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100

Створіть метод readNumber(int start, int end),
який читає з консолі ціле число та повертає його, якщо воно знаходиться в діапазоні [початок...кінець].
Якщо прочитано недійсне число або нечисловий текст, метод повинен викликати виняток.
використовуючи цей метод, напишіть метод main(), який має ввести 10 чисел:
a1, a2, ..., a10, такі, що 1 < a1 < ... < a10 < 100
 */

import com.softserve.homework.MyScanner.MyScannerClass;

import java.util.Arrays;
import java.util.InputMismatchException;

public class App {

    public static class ReadNumber {
        public static int readNumber ( int start, int end ) {
            try {
                MyScannerClass myScanner = new MyScannerClass( );
                System.out.println( "Please enter number in range from " + start + " to " + end + ": " );
                int number = myScanner.readInt( );

                if ( number > end || number < start ) {
                    throw new IndexOutOfBoundsException( "The entered number isn't in the range between start and end" );
                } else {
                    return number;
                }
            } catch (InputMismatchException ex) {
                System.out.println( "Exception was found:" + ex + "\n Please enter number of correct type" );
                return readNumber( start, end );
//            } catch (IndexOutOfBoundsException exception) {
//                System.out.println( "Exception was found:" + exception + "\n Please enter number in range between start and end" );
//                return readNumber( start, end );
            } catch (Exception exception) {
                System.out.println( "Other exception was found:" + exception );
                return readNumber( start, end );
            }
        }
    }

    public static void main ( String[] args ) {
        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = ReadNumber.readNumber( 1, 100 );
//        }
        Arrays.setAll( array, i -> ReadNumber.readNumber( 1, 100 ) );

        System.out.println( Arrays.toString( array ) );
    }
}