package com.softserve.homework.hw09.hw12.task2;
/*
Create a method readNumber(int start, int end), that read from console integer number and return it, if it is in the range [start...end].
If an invalid number or non-number text is read, the method should throw an exception.
    Using this method write a method main(), that must enter 10 numbers:
	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100

Створіть метод readNumber(int start, int end), який читає з консолі ціле число та повертає його, якщо воно знаходиться в діапазоні [початок...кінець].
Якщо прочитано недійсне число або нечисловий текст, метод повинен викликати виняток.
Використовуючи цей метод, напишіть метод main(), який має ввести 10 чисел:
a1, a2, ..., a10, такі, що 1 < a1 < ... < a10 < 100

 */

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class IntOutOfRange extends IndexOutOfBoundsException {
}

public class App {
    public static void main ( String[] args ) {
        readNumber( 10, 30 );

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = readNumber( 1, 100 );
        }
        System.out.println( Arrays.toString( arr ) );
    }
    public static int readNumber ( int start, int end ) {
        try {
            Scanner sc = new Scanner( System.in );
            System.out.println( "Please enter num in range from " + start + " to " + end + ": " );
            int num = sc.nextInt( );

            if ( num > end || num < start ) {
                throw new IntOutOfRange( );
            } else {
                return num;
            }
        } catch (InputMismatchException exception) {
            System.out.println( "Exception was found:" + exception + "\n Please enter num of correct type" );
            return readNumber( start, end );
        } catch (IntOutOfRange exception) {
            System.out.println( "Exception was found:" + exception + "\n Please enter num in range between start and end" );
            return readNumber( start, end );
        } catch (Exception exception) {
            System.out.println( "Exception was found:" + exception );
            return readNumber( start, end );
        }
    }
}