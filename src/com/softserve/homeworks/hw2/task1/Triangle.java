package com.softserve.homeworks.hw2.task1;

public class Triangle {
    private double firstSide;// змінні називай з малої літери і якщо два слова то друге з великої
    private double secondSide;
    private double thirdSide;


    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondside() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setFirstSide(double firstSide) {
        if (firstSide > 0) {
            this.firstSide = firstSide;
        }
    }

    public void setSecondside(double secondside) {
        if (secondside > 0) {
            this.secondSide = secondside;
        }
    }

    public void setThirdSide(double thirdSide) {
        if (thirdSide > 0) {
            this.thirdSide = thirdSide;
        }
    }
//методи називай одразу так щоб було зрозуміло що вони роблять
    // не забувай форматувати код
    // я прибрала локальну змінну area, бо можна отак зразу
    // площа правильно area
    // якщо в методі є return, то немає сенсу використовувати змінну
    public static double areaOfTriangle(Triangle triangle1) {
        double perimeter = (triangle1.getFirstSide() + triangle1.getSecondside() + triangle1.getThirdSide()) / 2;
        return Math.sqrt((perimeter * (perimeter - triangle1.getFirstSide()) * (perimeter - triangle1.getSecondside())
            * (perimeter - triangle1.getThirdSide())));

    }
}
