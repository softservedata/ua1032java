package practicals.p12.Test;

import java.util.function.IntBinaryOperator;

public class Child extends Parent {
    public void print () {
        System.out.println( "Class Child" );
    }

    public static void main ( String[] args ) {

        Parent object = new Child( );
        Child object2 = new Child();
            try {
            object.print( );
        } catch (Exception e) {
            System.out.println( "Block catch" );
        } finally {
            System.out.println( "Finally" );
        }
    }
}