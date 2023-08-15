package homeworkTwo;

/* A file with java code is given.
   Read program text from file and all words public in the declaration of class attributes
   and methods should be replaced with the word private. Save the result to another previously created file. */

import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class TaskTwo {
    public static void main(String[] args) {
        String inputFilePath = "/Users/irynavdovych/Desktop/iryna/original.txt";
        String outputFilePath = "/Users/irynavdovych/Desktop/iryna/modified.txt";
        try {
            List<String> lines = readFromFile(inputFilePath);
            List<String> modifiedLines = replacePublicWithPrivate(lines);
            writeToFile(outputFilePath, modifiedLines);
            System.out.println("Modifications have been made. Check other file " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> readFromFile(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
    }

    private static void writeToFile(String filePath, List<String> content) throws IOException {
        Files.write(Paths.get(filePath), content, StandardCharsets.UTF_8);
    }

    private static List<String> replacePublicWithPrivate(List<String> lines) {
        List<String> modifiedLines = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\bpublic\\b");
        for (String line : lines) {
            Matcher matcher = pattern.matcher(line);
            StringBuffer modifiedLine = new StringBuffer();
            while (matcher.find()) {
                matcher.appendReplacement(modifiedLine, "private");
            }
            matcher.appendTail(modifiedLine);
            modifiedLines.add(modifiedLine.toString());
        }
        return modifiedLines;
    }
}
