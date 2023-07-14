package com.softserve.lesson06.pt06.task03;

public class GeometryApp {
    public static void main(String[] args) {
        Line[] lines = {
                new Line(new Point(10, 15), new Point(20, 30)),
                new ColorLine(new Point(3, 5), new Point(15, 25), "red")};
        System.out.println(lines[0]);
        lines[0].print();
        System.out.println("///");
        System.out.println(lines[1]);
        lines[1].print();
    }
}
