package homework;

/* Create variable LocalDate birthday and set to that variable date your birthday.
   Create method that take as a parameter object LocalDate and print the day of the week
   and what was the day of the week after 6 months and what was the day of the week after 12 months. */

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TaskFour {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2004, 12, 27);
        calculateDate(birthday);
    }
    public static void calculateDate(LocalDate birthday) {
        System.out.println("Date of my birthday is " + birthday);

        DayOfWeek day = birthday.getDayOfWeek();
        System.out.println("I was born on " + day);

        LocalDate sixMon = birthday.plusMonths(6);
        DayOfWeek day6 = sixMon.getDayOfWeek();
        System.out.println("Day of the week in 6 months will be: " + day6);

        LocalDate twelveMon = birthday.plusMonths(12);
        DayOfWeek day12 = twelveMon.getDayOfWeek();
        System.out.println("Day of the week in 12 months will be: " + day12);
    }
}
