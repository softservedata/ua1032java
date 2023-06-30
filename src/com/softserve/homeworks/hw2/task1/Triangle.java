package com.softserve.homeworks.hw2.task1;

public class Triangle {
    private double firstside;
    private double secondside;
    private double thirdside;

    public Triangle(double firstside, double secondside, double thirdside) {
        this.firstside = firstside;
        this.secondside = secondside;
        this.thirdside = thirdside;
    }

    public double getFirstside() {
        return firstside;
    }

    public double getSecondside() {
        return secondside;
    }

    public double getThirdside() {
        return thirdside;
    }

    public void setFirstside(double firstside) {
        if(firstside > 0){
        this.firstside = firstside;
        }
    }

    public void setSecondside(double secondside) {
        if(secondside > 0){
        this.secondside = secondside;
        }
    }

    public void setThirdside(double thirdside) {
        if(thirdside > 0) {
            this.thirdside = thirdside;
        }
    }
    public static double squared(Triangle triangle1){
        double perimeter = (triangle1.getFirstside()+triangle1.getSecondside()+ triangle1.getThirdside())/2;
        double square = Math.sqrt((perimeter*(perimeter-triangle1.getFirstside())*(perimeter- triangle1.getSecondside())*(perimeter- triangle1.getThirdside())));
        return square;
    }
}
