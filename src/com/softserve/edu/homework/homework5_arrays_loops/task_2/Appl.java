package com.softserve.edu.homework.homework5_arrays_loops.task_2;


import java.io.IOException;
import java.util.Scanner;
import java.lang.System;

public class Appl {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        boolean flag;
        do {
            System.out.println(Do_While.Input());
            flag = Do_While.Agree_to_continue();
        } while (flag);
    }
}
