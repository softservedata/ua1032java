package practicals.p13.task1;

import java.io.IOException;

public class App {

    public class Parent {
        public void print () throws IOException {
            System.out.println( "Class Parent" );
            throw new IOException( );
        }
    }

    public class Child extends Parent {
        public void print () {
            System.out.println( "Class Child" );
        }
    }


    public static void main ( String[] args ) {

//        Parent object = new Child( );
//        try {
//            object.print( );
//        } catch (Exception e) {
//            System.out.println( "Block catch" );
//        } finally {
//            System.out.println( "Finally" );
//        }
    }
}