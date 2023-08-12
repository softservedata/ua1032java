package com.softserve.edu01.hw13.task4;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateBirthday {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2005, 7,8);

        Method(birthday);

    }
    public static void Method(LocalDate birthday) {

        LocalDate shiftedFirst = birthday.plusMonths(6);
        LocalDate shiftedSecond = birthday.plusMonths(12);

        DayOfWeek dayFirstShift = shiftedFirst.getDayOfWeek();
        DayOfWeek daySecondShift = shiftedSecond.getDayOfWeek();

        String dayOfWeekFirst = dayFirstShift.toString();
        String dayOfWeekSecond = daySecondShift.toString();

        System.out.println("plus 6 month to my birthday, it's " + dayOfWeekFirst);
        System.out.println("plus 12 month to my birthday, it's " + dayOfWeekSecond);

    }
}
