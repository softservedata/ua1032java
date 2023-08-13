package practicals.p1.readfile;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main ( String[] args ) throws FileNotFoundException {
//        String separator = File.separator;
//        String path = separator + "C:" + "Users" + "BTB" + "Desktop" + "Test.txt";
//        File file = new File ( path );
//        File file = new File ( "C:/Users/BTB/Desktop/Test.txt" );

//        Scanner scanner = new Scanner ( file );

//        while (scanner.hasNextLine ( )) {
//            System.out.println ( scanner.nextLine ( ) );
//        }

        File file1 = new File ( "C:/Users/BTB/Desktop/Test1.txt" );

        Scanner scanner1 = new Scanner ( file1 );
        String line = scanner1.nextLine ();
        String[] numbersString  = line.split ( " " );
//        String[] word  = line.split ( " " );
//        System.out.println ( Arrays.toString ( word ) );
        int[] numbers = new int[3];
        int counter = 0;
                for (String element: numbersString){

            numbers[counter++]  = Integer.parseInt ( element );
        }
        System.out.println ( Arrays.toString ( numbers ) );

        File file2 = new File ( "test" );
        System.out.println (file2 );

//        scanner.close ( );
    }
}
