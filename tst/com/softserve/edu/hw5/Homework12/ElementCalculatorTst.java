package com.softserve.edu.hw5.Homework12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ElementCalculatorTst {
    @Test
    public void checkIfPositiveTst(){
        ElementCalculator elementCalc = new ElementCalculator();


        int[] arr = new int[]{2, 6, 3, 4, -2, 1, 3, 2, 4, 5 };
        boolean expected;
        boolean actual;

        elementCalc.setElements(arr);
        System.out.println("First part");
        expected = false;
        actual = elementCalc.checkIfPositive();


        Assertions.assertEquals(expected, actual);


        arr = new int[]{2, 6, 3, 4, 2, 1, 3, 2, 4, 5};
        elementCalc.setElements(arr);
        System.out.println("Second part");
        expected = true;
        actual = elementCalc.checkIfPositive();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcElementsTst() {
        ElementCalculator elementCalc = new ElementCalculator();
        int expected, actual;

        System.out.println("First part");
        int[] arr = new int[]{2, 6, 3, 4, -2, 1, 3, 2, 4, 5 };
        elementCalc.setElements(arr);

        expected = 120;
        actual = elementCalc.calcElements();
        Assertions.assertEquals(expected, actual);

        System.out.println("Second part");

        arr = new int[]{2, 6, 3, 4, 2, -1, 3, 2, 4, 5 };
        elementCalc.setElements(arr);

        expected = 17;
        actual = elementCalc.calcElements();
        Assertions.assertEquals(expected, actual);
    }
}
