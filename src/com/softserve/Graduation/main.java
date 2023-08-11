package com.softserve.Graduation;

import com.softserve.Graduation.Class.Fruit;

import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
//        Fruit f = new Fruit("Str1", "color1");
//        System.out.println(f.print());
//        f = f.input();
//        System.out.println(f.print());
//        try {
//            System.out.println(f.print(new File("D:\\JAVA\\softServe\\src\\com\\softserve\\Graduation\\teat.txt")));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        Fruit fruit = new Fruit().input(new File("D:\\JAVA\\softServe\\src\\com\\softserve\\Graduation\\teat.txt"));
//        System.out.println(fruit.print());
        System.out.println(fruit.print(new File("D:\\JAVA\\softServe\\src\\com\\softserve\\Graduation\\teat.txt")));
        /***/

    }
}
