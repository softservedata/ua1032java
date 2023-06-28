package com.softserve.HomeWork.HW3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Triangle {
    private double a;   //first side of a triangle
    private double b;   //second side of a triangle
    private double c;   //third side of a triangle
    private double s;   //area of a triangle
    private double p;   //perimetr a triangle

    private void calculateAreaPerimetr(){
        p = a + b + c;
        s = Math.sqrt(p / 2 * (p / 2 - a) * (p / 2 - b) * (p / 2 - c)); //Heron's formula
    }

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
       calculateAreaPerimetr();
    }
    Triangle() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("First side: ");
        this.a = Integer.parseInt(br.readLine());
        System.out.print("Second side: ");
        this.b = Integer.parseInt(br.readLine());
        System.out.print("Third side: ");
        this.c = Integer.parseInt(br.readLine());
        calculateAreaPerimetr();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", s=" + s +
                '}';
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getS() {
        return s;
    }
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setS(double s) {
        this.s = s;
    }
}