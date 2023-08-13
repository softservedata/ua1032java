package com.softserve.Graduation;

import com.softserve.Graduation.Class.Citrus;
import com.softserve.Graduation.Class.Fruit;

import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        /**1.1*/
//        Fruit f = new Fruit("Str1", "color1");
//        System.out.println(f.print());
//        f.input();
//        System.out.println(f.print());
        /**1.2*/
//        f = f.input(new File("D:\\JAVA\\softServe\\src\\com\\softserve\\Graduation\\teat.txt"));
//        System.out.println(f.print(new File("D:\\JAVA\\softServe\\src\\com\\softserve\\Graduation\\teat.txt")));
        /**1.3*/
        Citrus citrus = new Citrus("Citrus1", "colorCitrus", 2.0d);
        System.out.println(citrus.print());
        citrus.input();
        System.out.println(citrus.print());
    }
}
