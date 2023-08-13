package com.softserve.homework.hw16.task1;
/*
Create file1.txt file with a text about your career.
Read context from file into array of strings. Each array item contains one line from file.
Write in to the file2.txt
   1) number of lines in file1.txt.
   2) the longest line in file1.txt.
   3) your name and birthday date.

Створіть файл file1.txt із текстом про свою кар’єру.
Читання контексту з файлу в масив рядків. Кожен елемент масиву містить один рядок із файлу.
Запишіть у файл file2.txt
    1) кількість рядків у файлі 1.txt.
    2) найдовший рядок у file1.txt.
    3) ваше ім'я та день народження.

 */

import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static List<String> writeIntoArray ( String fileName ) {
        List<String> result = null;
        try {
            BufferedReader bufferedReader = new BufferedReader ( new FileReader ( fileName ) );
            result = bufferedReader.lines ( ).collect ( Collectors.toList ( ) );
            bufferedReader.close ( );
        } catch (IOException e) {
            System.err.println ( "EXCEPTION: writing into array" );
        }
        return result;
    }

    public static void writeIntoFile ( List<String> list ) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter ( new FileWriter ( "file2.txt" ) );
            bufferedWriter.write ( list.size ( ) + "\n" );
            bufferedWriter.write ( list.stream ( ).max ( Comparator.comparing ( String::length ) ).toString ( ) + "\n" );
            bufferedWriter.write ( "Taras Bohoslavets 08.08.1983" );
            bufferedWriter.close ( );
        } catch (IOException e) {
            System.err.println ( "EXCEPTION: writing into file" );

        }

    }

    public static void main ( String[] args ) {
        System.out.println ( App.writeIntoArray ( "file1.txt" ) );
        writeIntoFile ( App.writeIntoArray ( "file1.txt" ) );
    }
}
