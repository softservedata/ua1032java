package com.softserve.practical.practical4.task2;

public enum Week {
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четвер"),
    FRIDAY("Friday", "П'ятниця"),
    SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    private final String enDayName;
    private final String ukDayName;

    Week(String enDayName, String ukDayName) {
        this.enDayName = enDayName;
        this.ukDayName = ukDayName;
    }

    public String getEnDayName() {
        return enDayName;
    }
    public String getUkDayName() {
        return ukDayName;
    }

    @Override
    public String toString() {
        return "Week{" +
                "enDayName='" + enDayName + '\'' +
                ", ukDayName='" + ukDayName + '\'' +
                '}';
    }
}
