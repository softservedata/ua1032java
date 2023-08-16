package com.softserve.Graduation.Class;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class FruitTest {
    @Test
    public void testFruitInputAndPrint(){
        Fruit fruit = new Fruit("Fruit1", "Color1");
        String expected = "Fruit: name = Fruit1; color = Color1";
        assertEquals(expected, fruit.print());
    }
    @Test
    public void testFruitInput() {
        String input = "Apple\nRed\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Fruit fruit = new Fruit("OneName", "OneColor");
        fruit.input();

        assertEquals("Apple", fruit.getName());
        assertEquals("Red", fruit.getColor());

        System.setIn(System.in);
    }
    @Test
    public void testFruitInputFromFile() throws IOException {
        String content = "Orange Yellow";
        File tempFile = File.createTempFile("test", ".txt");
        FileWriter fileWriter = new FileWriter(tempFile);
        fileWriter.write(content);
        fileWriter.close();

        Fruit fruit = new Fruit("InitialName", "InitialColor");
        fruit.input(tempFile);

        assertEquals("Orange", fruit.getName());
        assertEquals("Yellow", fruit.getColor());
    }
}
