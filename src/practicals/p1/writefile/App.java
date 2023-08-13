package practicals.p1.writefile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class App {
    public static void main ( String[] args ) throws FileNotFoundException {
        File file = new File ( "test" );
        PrintWriter printWriter = new PrintWriter (file);

        printWriter.println ( "Hello" );
        printWriter.println ( "Wold" );
        printWriter.println ( "!" );

        printWriter.close ();
    }
}
