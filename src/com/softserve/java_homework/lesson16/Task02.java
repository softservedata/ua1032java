package com.softserve.java_homework.lesson16;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Task02 {

    private static final String PUBLIC_ACCESS_MODIFIER = "public";
    private static final String PRIVATE_ACCESS_MODIFIER = "private";
    public static void main(String[] args) throws IOException {
        String fileName = "file3.txt";
        Path filePath = Path.of(fileName);
        Path javaFilePath = Path.of("C:\\Users\\USER\\ua1032java\\src\\com\\softserve\\java_homework\\lesson09\\Task01.java");

        try {
            List<String> lines = Files.readAllLines(javaFilePath).stream()
                    .map(line -> line.replaceAll(PUBLIC_ACCESS_MODIFIER, PRIVATE_ACCESS_MODIFIER)).toList();

            try (BufferedWriter writer = Files.newBufferedWriter(filePath, StandardOpenOption.CREATE)) {
                lines.forEach(line -> {
                    try {
                        writer.write(line);
                        writer.newLine();
                    } catch (IOException e) {
                        System.out.println("Error while writing: " + e.getMessage());
                    }
                });
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}