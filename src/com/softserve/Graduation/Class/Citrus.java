package com.softserve.Graduation.Class;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Citrus extends Fruit {
    private double vitaminC;

    public Citrus(String name, String color, double vitaminC) {
        super(name, color);
        this.vitaminC = vitaminC;
    }

    public double getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(double vitaminC) {
        this.vitaminC = vitaminC;
    }

    @Override
    public Fruit input() {
        super.input();
        this.vitaminC = new Scanner(System.in).nextDouble();
        return this;
    }

    @Override
    public void input(File nameFile) throws IOException {
        super.input(nameFile);
        try (BufferedReader reader = new BufferedReader(new FileReader(nameFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] s = line.split(" ");
                if (s.length >= 3) {
                    this.vitaminC = Double.parseDouble(s[2]);
                }
            }
        }
    }

    @Override
    public String print() {
        return super.print() + "; vitamin C = " + getVitaminC();
    }

    @Override
    public String print(File nameFile) throws IOException {
        return super.print(nameFile);
    }
}
