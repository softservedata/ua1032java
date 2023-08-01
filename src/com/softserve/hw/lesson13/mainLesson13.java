package com.softserve.hw.lesson13;

import com.softserve.hw.lesson13.task1.EncryptAndDecrypt;
import com.softserve.hw.lesson13.task2.DataPatern;
import com.softserve.hw.lesson13.task3.YearIsLeap;
import com.softserve.hw.lesson13.task4.BirthDay;

import java.time.LocalDate;

public class mainLesson13 {

    public static void main(String[] args) {
        System.out.println("task1");
        System.out.println(EncryptAndDecrypt.encrypt(" a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z,", 1));
        System.out.println(EncryptAndDecrypt.decrypt(" b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, a,", 1));
        System.out.println("task2");
        System.out.println(DataPatern.checkCorrectDate("04.19.03"));
        System.out.println("task3");
        System.out.println(YearIsLeap.check("1989"));
        System.out.println(YearIsLeap.check("2023"));
        System.out.println(YearIsLeap.check("2024"));
        System.out.println("task4");
        LocalDate date = LocalDate.of(2003, 4,19);
        BirthDay.checkWeek(date);
    }
}
