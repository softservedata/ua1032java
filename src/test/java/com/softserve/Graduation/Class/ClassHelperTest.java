package com.softserve.Graduation.Class;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ClassHelperTest {
    @Test
    public void testPrintFruitsByColor() {
        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit("Apple", "Red"));
        fruitList.add(new Fruit("Banana", "Yellow"));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ClassHelper.printFruitsByColor(fruitList, "Red");
        assertEquals("Fruit: name = Apple; color = Red\n", outContent.toString());

        System.setOut(System.out);
    }

    @Test
    public void testSortListByName() {
        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit("Banana", "Yellow"));
        fruitList.add(new Fruit("Apple", "Red"));

        List<Fruit> sortedList = ClassHelper.sortListByName(fruitList);

        assertEquals("Apple", sortedList.get(0).getName());
        assertEquals("Banana", sortedList.get(1).getName());
    }
}
