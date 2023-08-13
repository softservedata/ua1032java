package com.softserve.Graduation.Class;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Fruit {
    private String name;
    private String color;

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fruit input() {
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        this.color = sc.nextLine();
        return this;
    }


    public void input(File nameFile) throws IOException {
        if (!nameFile.canRead()) {
            System.out.println("Cannot read from this file");
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(nameFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] s = line.split(" ");
                if (s.length >= 2) {
                    this.name = s[0];
                    this.color = s[1];
                }
            }
        } catch (Exception e) {
            throw new IOException("An error occurred while reading the file.", e);
        }
    }


    public String print() {
        return "Fruit: "
                + "name = " + getName() + "; "
                + "color = " + getColor();
    }

    public String print(File nameFile) throws IOException {
        StringBuilder result = new StringBuilder();
        if (!nameFile.canRead()) {
            return "You not execute this file";
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(nameFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line).append(System.lineSeparator());
            }
        } catch (Exception e) {
            throw new IOException("An error occurred while reading the file.", e);
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
