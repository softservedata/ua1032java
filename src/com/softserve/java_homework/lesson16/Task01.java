package com.softserve.java_homework.lesson16;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class Task01 {

    private final static String MY_CAREER = """
            I have substantial experience in customer support, primarily with German-speaking clients.
            I am an emerging tech professional based in Ukraine, where I am honing my skills
            as a Java developer. Recently, I successfully completed the HTML, CSS,
            and JavaScript Fundamentals course at the SoftServe Academy.
            There, I had the opportunity to serve as a team lead on a website project for a restaurant.
            This project provided me with invaluable experience in teamwork and problem-solving.
            Currently, I am learning Java Fundamentals and I'm thrilled about
            the new opportunities for learning and skill development.
            """;
    public static void main(String[] args) throws IOException {
        String filename1 = "file1.txt";
        String filename2 = "file2.txt";

        Path filePath1 = Path.of(filename1);
        Path filePath2 = Path.of(filename2);

        try (BufferedWriter writer1 = Files.newBufferedWriter(filePath1, StandardOpenOption.CREATE)) {
            writer1.write(MY_CAREER);
        }
            List<String> lines = Files.readAllLines(filePath1);

        try (BufferedWriter writer2 = Files.newBufferedWriter(filePath2, StandardOpenOption.CREATE)) {
            writer2.write("Count lines: " + lines.size());
            writer2.newLine();

            String longestLine = lines.stream().max(Comparator.comparing(String::length)).orElse("");
            writer2.write("Longest line: " + longestLine);
            writer2.newLine();

            writer2.write("Name: Augustin");
            writer2.newLine();
            LocalDate birthday = LocalDate.of(1999,8,6);
            writer2.write("Birthday date: " + birthday);
        }

        System.out.println(Files.readString(filePath2, StandardCharsets.UTF_8));
    }
}
