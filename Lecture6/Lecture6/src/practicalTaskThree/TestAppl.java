package practicalTaskThree;

/* Create three classes − Point, Line, and ColorLine:
• The "Point" class should have attributes "x" and "y".
• The "Line" class should contain two objects of the "Point" class.
• The "ColorLine" class should have an additional attribute "color", which extends the "Line" class.
 Override toString() method and define print() method in every classes.
 In main() method create an array of Line objects and add some instances of both Line and ColorLine to it.
 Call the print() method for all objects in the array. */

public class TestAppl {
    public static void main(String[] args) {
        Line[] lines = new Line[3];

        Point p1 = new Point( 1, 2.5);
        Point p2 = new Point( 1.7, 9);
        Point p3 = new Point( 8, 13);

        lines[0] = new Line(p1, p2);
        lines[1] = new ColorLine(p2, p3, "Pink");
        lines[2] = new ColorLine(p3, p1, "Purple");

        for (int i = 0; i < lines.length; i++) {
            Line line = lines[i];
            line.print();
        }
    }
}
