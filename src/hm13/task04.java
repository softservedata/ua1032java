package hm13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class task04 {
    public static class BirthdayExample {
        public static void main(String[] args) {
            LocalDate birthday = LocalDate.of(1990, Month.JULY, 15); // Replace with your actual birthday

            printDayOfWeekInfo(birthday);
        }

        public static void printDayOfWeekInfo(LocalDate date) {
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            System.out.println("Day of the week for " + date + ": " + dayOfWeek);

            LocalDate sixMonthsLater = date.plusMonths(6);
            DayOfWeek dayOfWeekAfter6Months = sixMonthsLater.getDayOfWeek();
            System.out.println("Day of the week after 6 months: " + dayOfWeekAfter6Months);

            LocalDate twelveMonthsLater = date.plusMonths(12);
            DayOfWeek dayOfWeekAfter12Months = twelveMonthsLater.getDayOfWeek();
            System.out.println("Day of the week after 12 months: " + dayOfWeekAfter12Months);
        }
    }

}
