package homework;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondTask {
    public static void main(String[] args) throws IOException {
        String file = "/Users/zz/Desktop/course/JavaFundamentals/Homework/ua1032java/Lesson16/src/homework/original";
        String file0 = "/Users/zz/Desktop/course/JavaFundamentals/Homework/ua1032java/Lesson16/src/homework/modified";

        try {
            List<String>lines= readFromFile(file);
            List<String>modifiedlines =replacePublicWithPrivate(lines);
            writeToFile(file0,modifiedlines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

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

    private static List<String> readFromFile(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
    }

    private static void writeToFile(String filePath, List<String> content) throws IOException {
        Files.write(Paths.get(filePath), content, StandardCharsets.UTF_8);
    }

}
