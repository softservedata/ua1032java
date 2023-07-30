package com.softserve.homework.hw13.task2;
/*
2. Create method to validate date according to format "mm.dd.yy"
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class App {
    public static boolean validateDate ( String dateStr ) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "MM.dd.yy" );

        try {
            Date date = simpleDateFormat.parse( dateStr );

            String formattedDate = simpleDateFormat.format( date );
            return dateStr.equals( formattedDate );

        } catch (ParseException e) {
            return false;
        }
    }

    public static void main ( String[] args ) {

        System.out.println( validateDate( "12.31.23" ) );
        System.out.println( validateDate( "02.29.23" ) );
        System.out.println( validateDate( "03.28.24" ) );
        System.out.println( validateDate( "13.01.23" ) );
        System.out.println( validateDate( "07.20.25" ) );
        System.out.println( validateDate( "00.10.23" ) );
    }
}
