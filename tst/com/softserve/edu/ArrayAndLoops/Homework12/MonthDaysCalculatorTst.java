package com.softserve.edu.ArrayAndLoops.Homework12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthDaysCalculatorTst {
    @Test

    public void numOfMonthTst(){
        MonthDaysCalculator monthDays = new MonthDaysCalculator();

        int[] arr = monthDays.getDaysInMonth();
        int expected, actual;

        monthDays.setMonthNum(2);

        expected = arr[monthDays.getMonthNum()];
        actual = monthDays.numOfMonth();

        Assertions.assertEquals(expected, actual);

    }


}
