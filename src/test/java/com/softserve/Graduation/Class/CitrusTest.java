package com.softserve.Graduation.Class;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class CitrusTest {
    private final InputStream systemIn = System.in;
    private ByteArrayInputStream testIn;

    @Before
    public void setUpInput() {
        String input = "Apple\nRed\n21.2\n";
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);
    }


    @After
    public void restoreSystemIn() {
        System.setIn(systemIn);
    }

    @Test
    public void testCitrusInputFromConsole() {
        Citrus citrus = new Citrus("InitialName", "InitialColor", 0.0);
        citrus.input();

        assertEquals("Apple", citrus.getName());
        assertEquals("Red", citrus.getColor());
        assertEquals(21.2, citrus.getVitaminC(), 0.001);
    }

    @Test
    public void testCitrusInputFromFile() throws IOException {

        File tempFile = createTempFileWithContent("Lemon Yellow 2.0");

        Citrus citrus = new Citrus("InitialName", "InitialColor", 0.0);
        citrus.input(tempFile);

        assertEquals("Lemon", citrus.getName());
        assertEquals("Yellow", citrus.getColor());
        assertEquals(2.0, citrus.getVitaminC(), 0.001);
    }

    @Test
    public void testCitrusPrint() {
        Citrus citrus = new Citrus("Orange", "Orange", 1.5);
        String expected = "Fruit: name = Orange; color = Orange; vitamin C = 1.5";
        assertEquals(expected, citrus.print());
    }

    private File createTempFileWithContent(String content) throws IOException {
        File tempFile = File.createTempFile("temp", ".txt");
        tempFile.deleteOnExit();

        try (PrintWriter writer = new PrintWriter(tempFile)) {
            writer.write(content);
        }

        return tempFile;
    }
}
