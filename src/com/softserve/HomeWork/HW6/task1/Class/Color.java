package com.softserve.HomeWork.HW6.task1.Class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public enum Color {
    BLACK,
    WHITE,
    RED,
    GRAY,
    GREEN,
    BROWN;

    public static Color input()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input color: ");
        String str = br.readLine();
        str = str.toUpperCase();
        for (Color temp: Color.values()){
            if (str.equals(temp.toString())){
                return temp;
            }
        }
        System.out.println("We did not find such a thing");
        return WHITE;
    }
}
