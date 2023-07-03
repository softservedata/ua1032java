package com.softserve.java_homework.lesson02;

class Task01 {
    public static void main(String[] args) {
        double area = Math.round(getArea(4.2, 5.6, 4.1) * 100.0) / 100.0;
        System.out.println("Area: " + area);
    }

    public static double getArea(double a, double b, double c) {
        double sp = (a + b + c) / 2;
        return Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));
    }
}