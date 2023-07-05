package com.softserve.homework.hw04.task4;

import java.time.LocalDate;
// у сезонах того не вказано було, але
//малось на увазі, що весна -літній семестр, осінь і зима -осінній
//літо -канікули або щось таке
public class CurrentSeason {
    public static Season getCurrentSeason() {
        LocalDate currentDate = LocalDate.now();
        int month = currentDate.getMonthValue();

        //Determinate current season referring to the current month
        if (month >= 3 && month <= 5) {
            return Season.SPRING;
        } else if (month >= 6 && month <= 8) {
            return Season.SUMMER;
        } else if (month >= 9 && month <= 11) {
            return Season.AUTUMN;
        } else {
            return Season.WINTER;
        }
    }
}
