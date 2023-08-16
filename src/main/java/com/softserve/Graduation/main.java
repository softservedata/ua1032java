package com.softserve.Graduation;

import com.softserve.Graduation.Class.Citrus;
import com.softserve.Graduation.Class.ClassHelper;
import com.softserve.Graduation.Class.Fruit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        /**1.1
         * create a fruit object
         * print it to the console using the print() method
         * change the data by seeing it through the console using the input() method
         * print it to the console using the print() method
         * */
        Fruit f = new Fruit("Str1", "color1");
        /**1.2
         * create file.txt
         * enter data from file
         * */
        File inputAnfPrintFile = new File("D:\\JAVA\\softServe\\src\\main\\java\\com\\softserve\\Graduation\\files\\test.txt");
        f.input(inputAnfPrintFile);
        System.out.println(f.print());
        System.out.println(f.print(inputAnfPrintFile));
        /**2*/
        Citrus citrus = new Citrus("Citrus1", "colorCitrus", 2.0d);
//        System.out.println(citrus.print());
//        citrus.input(inputAnfPrintFile);
//        System.out.println(citrus.print());
//        System.out.println(citrus.print(inputAnfPrintFile));
//        citrus.input();
//        System.out.println(citrus.print());
        /**3*/
        /**Test*/
        File file2 = new File("D:\\JAVA\\softServe\\src\\com\\softserve\\Graduation\\proba.txt");

        List<Fruit> fruitOne = new ArrayList<>();
        fruitOne.add(new Fruit("apple", "red"));
        fruitOne.add(new Fruit("appleTow", "yellow"));
        fruitOne.add(new Fruit("pineapple", "green"));
        fruitOne.add(new Fruit("banana", "yellow"));
        fruitOne.add(new Fruit("cherry", "red"));

        fruitOne.add(new Citrus("orange", "orange", 1.5));
        fruitOne.add(new Citrus("grapefruit", "orange", 2.5));
        fruitOne.add(new Citrus("lemon", "yellow", 3.5));
        fruitOne.add(new Citrus("orangeTwo", "orangeTwo", 4.5));
        fruitOne.add(new Citrus("plum", "yellow", 5.5));
        // input fruits were color equals "yellow"
        /**1*/
//        ClassHelper.printFruitsByColor(fruitOne, "yellow");
        /**2*/
//        List<Fruit> fruitTwo = ClassHelper.sortListByName(fruitOne);
//        ClassHelper.printFile(fruitTwo, file2);
//        /**3SerilazeObject*/
//        File fileSerllize = new File("D:\\JAVA\\softServe\\src\\com\\softserve\\Graduation\\serializedOneObject.xml");
//        Fruit fruit = new Fruit("FruitSer", "ColorSer");
//        ClassHelper.serializedObject(fruit, fileSerllize);
//        ClassHelper.deserialized(fileSerllize);
//        System.out.println("-".repeat(100));
//        /***/
//        File fileSerilizedList = new File("D:\\JAVA\\softServe\\src\\com\\softserve\\Graduation\\serilzedList.xml");
//        ClassHelper.serializedList(fruitOne,fileSerilizedList);
//        ClassHelper.deserializedList(fileSerilizedList);
    }
}

