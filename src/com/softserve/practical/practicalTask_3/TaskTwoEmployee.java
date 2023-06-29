package com.softserve.practical.practicalTask_3;

public class TaskTwoEmployee {
    private String name;
    private int rate;
    private int hour;
    private static int totalSum;

    public TaskTwoEmployee(String name, int rate, int hour) {
        this.name = name;
        this.rate = rate;
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public static int getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(int totalSum) {
        TaskTwoEmployee.totalSum = totalSum;
    }

    public double getSalary(){
        return rate*hour;
    }
    public double getBonuses(){
        return getSalary()/100*10;
    }

    @Override
    public String toString() {
        return "TaskTwoEmployee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hour=" + hour +
                '}';
    }
}
