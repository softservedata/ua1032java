package com.softserve.edu01rect;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * JavaDoc Comment.
 *
 * This is <font color="RED"><b>Super</b> Class</font>.
 */
public class Appl {

    public static void main(String[] args) throws Exception {
        // One-line Comment
        System.out.println("Hello\n World!\\");
        int i;
        //
        i = 123;
        /*
         * Multi-Line Comments
         */
        System.out.println("i = " + i);
        char c = '1';
        System.out.println("c = " + c + "   code of c = " + (int) c);
        //
        String s = "Hello Ivan"; // s = new String("Hello Ivan");
        //
        Rectangle r = new Rectangle(3.5, 2);
        System.out.println("Area = " + r.getArea());
        //
        ActionEvent a;
        //Event e;
        //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What your name? ");
        String name = br.readLine();
        System.out.print("How old are you? ");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Hello " + name + " Your age is " + age);
        System.out.print("Read double: ");
        double t = Double.parseDouble(br.readLine());
        System.out.println(" t = " + (t * 2) );
    }
}
