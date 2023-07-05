package com.softserve.lesson04.pt04.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContinentsApp {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Continents continents;

        System.out.println("Enter the country to get its continents: ");
        System.out.println(Continents.determineYourContinent(bufferedReader.readLine()));

        bufferedReader.close();
    }
}
