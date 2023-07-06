package com.softserve.Homework.hw_5.task4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Random;

public class TestGame {
    @Test
    public void testFindNumber() {
        Random random = new Random();
        int numberToFind = random.nextInt(100) + 1;
        boolean numberFound = false;

        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(100) + 1;
            if (number == numberToFind) {
                numberFound = true;
                break;
            }
        }

        Assertions.assertTrue(numberFound, "The number " + numberToFind + " should be found");
    }
}
