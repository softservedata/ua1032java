package com.softserve.HomeWork.HW5.task1.task1_1;

public enum Month {
    January("January",1,30),
    February("February",2,28),
    March("March",3,31),
    April("April",4,30),
    May("May",5,31),
    June("June",6,30),
    July("July",7,31),
    August("August",8,31),
    September("September",9,30),
    October("October",10,31),
    November("November",11,30),
    December("December",12,31);
    private String name;
    private int numberMonth;
    private int days;

    Month(String name, int numberMonth, int days) {
        this.name = name;
        this.numberMonth = numberMonth;
        this.days = days;
    }

    public static Month getByMonthNumber(int numberMonth) {
        for (Month month : Month.values()) {
            if (month.numberMonth == numberMonth) {
                return month;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                ", numberMonth=" + numberMonth +
                ", days=" + days +
                '}';
    }
}
