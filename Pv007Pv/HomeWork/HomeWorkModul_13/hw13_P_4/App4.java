package hw13_P_4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 4. Create variable LocalDate birthday and set to that variable date your birthday.
 * Create method that take as a parameter object LocalDate and pring the day of the week
 * and what was the day of the week after 6 months and what was the day of the week after
 * 12 months.
 * */

public class App4 {
    // Method to print the day of the week and the days of the week after 6 and 12 months
    public static void printDayOfWeek(LocalDate date) {
        // Printing the day of the week for the given date
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Day of the week: " + dayOfWeek);

        // Printing the day of the week after 6 months
        LocalDate after6Months = date.plusMonths(6);
        DayOfWeek dayOfWeekAfter6Months = after6Months.getDayOfWeek();
        System.out.println("Day of the week after 6 months: " + dayOfWeekAfter6Months);

        // Printing the day of the week after 12 months
        LocalDate after12Months = date.plusMonths(12);
        DayOfWeek dayOfWeekAfter12Months = after12Months.getDayOfWeek();
        System.out.println("Day of the week after 12 months: " + dayOfWeekAfter12Months);
    }

    public static void main(String[] args) {
        // Setting the date of your birthday in the format "year-month-day"
        String birthdayString = "2023-07-17";

        // Parsing the string with the date and converting it to a LocalDate object
        LocalDate birthday = LocalDate.parse(birthdayString, DateTimeFormatter.ISO_LOCAL_DATE);

        // Calling the printDayOfWeek method and passing the birthday object
        printDayOfWeek(birthday);
    }
}

