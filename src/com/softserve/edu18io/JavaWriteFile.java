package com.softserve.edu18io;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

class JavaWriteFile {

    public static void main(String[] args) throws IOException {

        Path myPath = Paths.get("\\Tools/1//test.txt//");

        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        System.out.println(animals);

        Files.write(myPath, animals, StandardCharsets.UTF_8, StandardOpenOption.CREATE);

        System.out.println("Data written");
    }
}