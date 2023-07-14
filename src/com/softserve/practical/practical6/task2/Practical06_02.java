package com.softserve.practical.practical6.task2;

public class Practical06_02 {
    // TODO: Create three classes − Point, Line, and ColorLine:
    //      - The "Point" class should have attributes "x" and "y".
    //      - The "Line" class should contain two objects of the "Point" class.
    //      - The "ColorLine" class should have an additional attribute "color", which extends the
    //      "Line" class.
    //      Override toString() method and define print() method in every classes.
    //      In main() method create an array of Line objects and add some instances of both Line and
    //      ColorLine to it. Call the print() method for all objects in the array.

    public static void main(String[] args) {
        Line[] lines = {
                new Line(new Point(1, 1), new Point(1, 3)),
                new Line(new Point(1, 1), new Point(2,1)),
                new ColorLine(new Point(2,3), new Point(3,4), "red"),
                new ColorLine(new Point(3,4), new Point(5,2), "green")
        };

        for(Line line: lines){
            line.print();
            System.out.println();
        }
    }
}
