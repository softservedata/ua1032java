package com.softserve.lesson04.pt04.task02;

public class DayOfWeek {
    private int numOfTheDay;

    public DayOfWeek() {
    }

    public DayOfWeek(int numOfTheDay) {
        this.numOfTheDay = numOfTheDay;
    }

    public int getNumOfTheDay() {
        return numOfTheDay;
    }

    public void setNumOfTheDay(int numOfTheDay) {
        this.numOfTheDay = numOfTheDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DayOfWeek dayOfWeek = (DayOfWeek) o;

        return numOfTheDay == dayOfWeek.numOfTheDay;
    }

    @Override
    public int hashCode() {
        return numOfTheDay;
    }

    @Override
    public String toString() {
        return "DayOfWeek {" +
                "numOfTheDay= " + numOfTheDay +
                '}';
    }

    public void whatIsTheDay() {
        if (this.numOfTheDay >=1 && this.numOfTheDay<=7) {
            switch (this.numOfTheDay) {
                case 1 -> System.out.println("Monday, Понеділок");
                case 2 -> System.out.println("Tuesday, Вівторок");
                case 3 -> System.out.println("Wednesday, Середа");
                case 4 -> System.out.println("Thursday, Четвер");
                case 5 -> System.out.println("Friday, П'ятниця");
                case 6 -> System.out.println("Saturday, Субота");
                case 7 -> System.out.println("Sunday, Неділя");
                default -> System.out.println("Wrong data");
            }
        }
        else
            System.out.println("Wrong number of day");
    }
}
