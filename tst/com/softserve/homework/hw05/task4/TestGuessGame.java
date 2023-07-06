package com.softserve.homework.hw05.task4;

import com.softserve.homework.hw05.task3.Car;
import com.softserve.homework.hw05.task3.TypeOfCars;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGuessGame {
    @Test
    public void findModelsByYearTest01() {

        boolean actual = GuessNumber.game(5, 6);

        boolean expected = false;
        // check
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findModelsByYearTest02() {

        boolean actual = GuessNumber.game(6, 6);

        boolean expected = true;
        // check
        Assertions.assertEquals(expected, actual);
    }
}
