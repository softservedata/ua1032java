package com.softserve.homework.hw16.task2;
/*
A file with java code is given.
Read program text from file and all words public in the declaration of class attributes
and methods should be replaced with the word private.
Save the result to another previously created file.

Надається файл із кодом java.
Прочитати текст програми з файлу та всі слова public в декларації атрибутів класу
і методи слід замінити словом private.
Збережіть результат в інший раніше створений файл.
 */

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void publicToPrivate ( String fileName ) {
        try {
            BufferedReader bufferedReader = new BufferedReader ( new FileReader ( fileName ) );
            List<String> arrayList = bufferedReader
                    .lines ( )
                    .map ( x -> x.replaceAll ( "public", "private" ) )
                    .toList ( );

            BufferedWriter bufferedWriter = new BufferedWriter ( new FileWriter ( fileName ) );
            for (String s : arrayList) {
                bufferedWriter.write ( s + "\n" );
            }

            bufferedReader.close ( );
            bufferedWriter.close ( );

        } catch (IOException e) {
            System.err.println ( "ERROR: changing public to private" );
        }
    }

    public static void main ( String[] args ) throws IOException {
        String fileName = "codeFile.txt";
        App.publicToPrivate ( fileName );
    }
}
