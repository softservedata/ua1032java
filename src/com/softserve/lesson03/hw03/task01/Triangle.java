package com.softserve.lesson03.hw03.task01;

import java.util.Scanner;

public class Triangle {
    private float firstSide;
    private float secondSide;
    private float thirdSide;

    public Triangle() {
        firstSide = 0;
        secondSide = 0;
        thirdSide = 0;
    }
    public Triangle (float firstSide, float secondSide, float thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public float getFirtsSide() {
        return firstSide;
    }

    public void setFirtsSide(int firtsSide) {
        this.firstSide = firtsSide;
    }

    public float getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public float getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(int thirdSide) {
        this.thirdSide = thirdSide;
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "firtsSide= " + firstSide +
                ", secondSide= " + secondSide +
                ", thirdSide= " + thirdSide +
                '}';
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side 1: ");
        this.firstSide = scanner.nextInt();
        System.out.println("Input side 2: ");
        this.secondSide = scanner.nextInt();
        System.out.println("Input side 3: ");
        this.thirdSide = scanner.nextInt();
    }

    public double getArea() {
        double p = (this.firstSide + this.secondSide + this.thirdSide) / 2;
        double s = Math.sqrt(p*(p-this.firstSide)*(p-this.secondSide)*(p-this.thirdSide));
        return Math.round(s*100)/100D;
    }

}
