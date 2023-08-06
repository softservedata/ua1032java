package practicals.p12.Test1;

import java.io.IOException;

public class Example {

    public static void test1 () throws NumberFormatException {
        throw new NumberFormatException( );
    }

    public static void test2 () throws IOException {
        throw new IOException( );
    }

    public static void main ( String s[] ) throws Exception {
        try {
            test2( );
        } finally {
            test1( );
        }
    }
}