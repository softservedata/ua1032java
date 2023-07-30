package com.softserve.homework.hw13.task4;
/*
4. Create variable LocalDate birthday and set to that variable date your birthday.
Create method that take as a parameter object LocalDate and print the day of the week and
what was the day of the week after 6 months and what was the day of the week after 12 months.
4. ������� ����� LocalDate ���� ���������� �� ��������� �� ����� ���� ����� ��� ����������.
������� �����, ���� ������ �� �������� ��'��� LocalDate � ����� ���� ����� �
���� ���� ����� ��� ����� 6 ������ � ���� ���� ����� ����� 12 ������.
 */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main ( String[] args ) {
        LocalDate birthday = LocalDate.of( 1983, 8, 8 );
        printDayOfWeekInfo( birthday );
    }
    public static void printDayOfWeekInfo ( LocalDate birthday ) {

        DayOfWeek birthdayDayOfWeek = birthday.getDayOfWeek( );
        System.out.println( "Your birthday falls on a " + birthdayDayOfWeek );

        LocalDate sixMonthsLater = birthday.plusMonths( 6 );
        DayOfWeek sixMonthsDayOfWeek = sixMonthsLater.getDayOfWeek( );
        System.out.println( "The day of the week after 6 months is " + sixMonthsDayOfWeek );

        LocalDate twelveMonthsLater = birthday.plusMonths( 12 );
        DayOfWeek twelveMonthsDayOfWeek = twelveMonthsLater.getDayOfWeek( );
        System.out.println( "The day of the week after 12 months is " + twelveMonthsDayOfWeek );

        System.out.println(LocalDateTime.now().format( DateTimeFormatter.ofPattern( "yyyy-MM-dd HH:mm:ss" ) ));
    }
}
