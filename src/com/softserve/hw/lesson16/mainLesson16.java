package com.softserve.hw.lesson16;

import com.softserve.hw.lesson16.task1.HelperFile;
import com.softserve.hw.lesson16.task2.Cla;

import java.io.*;

public class mainLesson16 {
    public static void main(String[] args) {
        System.out.println("task1");
        File fileFirst = new File("D:\\JAVA\\softServe\\src\\com\\softserve\\hw\\lesson16\\task1\\file.txt");
        File fileSecond = new File("D:\\JAVA\\softServe\\src\\com\\softserve\\hw\\lesson16\\task1\\file2.txt");
        HelperFile.seekNumberOfLineAndMaxLine(fileFirst, fileSecond);
        HelperFile.seekBerthDay(fileFirst, fileSecond);
        System.out.println("task2");
        File fileOne = new File("D:\\JAVA\\softServe\\src\\com\\softserve\\hw\\lesson16\\task2\\fileOne.txt");
        File fileTwo = new File("D:\\JAVA\\softServe\\src\\com\\softserve\\hw\\lesson16\\task2\\fileTwo.txt");
        Cla.method(fileOne,fileTwo);
    }
}
