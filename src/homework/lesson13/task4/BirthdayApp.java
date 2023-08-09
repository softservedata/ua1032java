package homework.lesson13.task4;

import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.TemporalAdjusters;

public class BirthdayApp {
    public static void printDays(LocalDate birthday) {
        System.out.println("6 month after : " + birthday.plusMonths(6).getDayOfWeek());
        System.out.println("12 month after : " + birthday.plusMonths(12).getDayOfWeek());
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2004, 11, 21);
        printDays(birthday);
    }
}
