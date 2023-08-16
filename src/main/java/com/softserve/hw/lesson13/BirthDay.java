package com.softserve.hw.lesson13;

import java.time.LocalDate;

//public class mainLesson13 {
//
//    public static void main(String[] args) {
//        System.out.println("task1");
//        System.out.println(EncryptAndDecrypt.encrypt(" a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z,", 1));
//        System.out.println(EncryptAndDecrypt.decrypt(" b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, a,", 1));
//        System.out.println("task2");
//        System.out.println(DataPatern.checkCorrectDate("04.19.03"));
//        System.out.println("task3");
//        System.out.println(YearIsLeap.check("1989"));
//        System.out.println(YearIsLeap.check("2023"));
//        System.out.println(YearIsLeap.check("2024"));
//        System.out.println("task4");
//        LocalDate date = LocalDate.of(2003, 4,19);
//        BirthDay.checkWeek(date);
//    }
//}
import java.time.format.TextStyle;
import java.util.Locale;

public class BirthDay {

    private static final LocalDate birthday = LocalDate.of(2003, 4, 19); // Replace this with your actual birthday.

    public static void checkWeek(LocalDate date) {
        String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        String dayOfWeekAfter6Months = date.plusMonths(6).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        String dayOfWeekAfter12Months = date.plusMonths(12).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        System.out.println("The day of the week: " + dayOfWeek);
        System.out.println("The day of the week after 6 months: " + dayOfWeekAfter6Months);
        System.out.println("The day of the week after 12 months: " + dayOfWeekAfter12Months);
    }

    public static void main(String[] args) {
        // Your previous code remains unchanged...

        System.out.println("task4");
        LocalDate date = LocalDate.of(2003, 4, 19);
        checkWeek(date);
    }
}
