package com.softserve.Practical.P4;

public enum DayOfWeek {
    MONDAY("Monday"," Понеділок"),
    TUESDAY("Tuesday","Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday","Четвер"),
    FRIDAY("Friday","П'ятниця"),

    SATURDAY("Saturday","Субота"),
    SUNDAY("Sunday","Неділя");

    private String UA;
    private String EN;

    DayOfWeek(String EN, String UA) {
        this.UA = UA;
        this.EN = EN;
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "UA='" + UA + '\'' +
                ", EN='" + EN + '\'' +
                '}';
    }
}
