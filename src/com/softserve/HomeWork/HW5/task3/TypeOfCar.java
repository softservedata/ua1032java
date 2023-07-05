package com.softserve.HomeWork.HW5.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public enum TypeOfCar {
    SEDAN,
    HATCHBACK,
    SUV,
    COUPE,
    CONVERTIBLE,
    MINIVAN,
    SPORTS,
    ELECTRIC;
    public static TypeOfCar input()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What type? Sedan/Hatchback/SUV/Coupe/Convertible/Minivan/Sports Car/Electric Car");
        String str = br.readLine();
        str = str.toUpperCase();
        return switch (str){
            case "SEDAN"->SEDAN;
            case "HATCHBACK" ->HATCHBACK;
            case "SUV" ->SUV;
            case "COUPE" ->COUPE;
            case "CONVERTIBLE" ->CONVERTIBLE;
            case "MINIVAN" ->MINIVAN;
            case "SPORTS" ->SPORTS;
            case "ELECTRIC" ->ELECTRIC;
            default -> SEDAN;
        };
    }
}
