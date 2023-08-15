package com.softserve.Homework.hw_16.Task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // Get the file to read from
        File fileToRead = new File("src\\com\\softserve\\Homework\\hw_16\\Task2\\file1.txt");

        // Create a new file to write to
        File fileToWrite = new File("src\\com\\softserve\\Homework\\hw_16\\Task2\\file2.txt");

        // Read the contents of the file into a list of strings
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileToRead))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }

        // Print text from file to console
        System.out.println("Text from file1.txt:\n");
        for (String line : lines) {
            System.out.println(line);
        }

        // Replace all instances of "public" with "private" in the declaration of class attributes and methods
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            line = line.replaceAll("\\bpublic\\s+(?!class)", "private ");
            lines.set(i, line);
        }

        // Write the modified lines to the new file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToWrite))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}

