package com.softserve.homework.hw12.task1;
/*
Create div() method, which calculates the dividing of two double type numbers.
In main() method input 2 double numbers and call this method.
Catch all exceptions.
 */

import com.softserve.homework.MyScanner.MyScannerClass;

public class App {

    public static double div ( double num1, double num2 ) throws ArithmeticException {
        if ( num2 == 0 ) {
            throw new ArithmeticException( "Division by zero is not allowed" );
        }
        return (num1 / num2);
    }

    public static void main ( String[] args ) {

        try (MyScannerClass myScanner = new MyScannerClass( )) {
            System.out.println( "Enter two double numbers: " + "\n" );
            double num1 = myScanner.readDouble( );
            double num2 = myScanner.readDouble( );
            System.out.println( div( num1, num2 ) );

        } catch (ArithmeticException | NumberFormatException exception) {
            System.out.println( exception.getMessage( ) );
        } catch (Exception exception) {
            System.out.println( "Please enter exactly number, or other problem." );
//            exception.printStackTrace( );
            /*
        ����� �� ������ ������� ���������� ��� ���������� � �������, �� ������ e.printStackTrace(),
        ���� �� �������� ���� ����� ����������, �� System.err.println(e.getMessage()).

        printStackTrace �������� ������ ��� ����:
        ����� ����� ����������,
        ����������� (message ���� ���� �, ����� �� ������� null)
        � stack trace.
        �� ���� ��������, ��� ���� ��� ���������� �����
         */
        } finally {
            System.out.println( "Good job!" );
        }
    }
}