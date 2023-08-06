package practicals.p12.Test;

import java.io.IOException;

public class Parent {
    public void print () throws IOException {
        System.out.println( "Class Parent" );
        throw new IOException( );
    }
}
