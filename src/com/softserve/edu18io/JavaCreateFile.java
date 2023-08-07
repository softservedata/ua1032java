package com.softserve.edu18io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class JavaCreateFile {
    public static void main(String[] args) throws IOException {

        Path myPath = Paths.get("\\Tools/1//test.txt//");
        System.out.println("AbsolutePath: " + myPath.toAbsolutePath());
        if (Files.exists(myPath)) {
            System.out.println("File already exists");
        } else {
            Files.createFile(myPath);
            System.out.println("File created");
        }
    }
}
