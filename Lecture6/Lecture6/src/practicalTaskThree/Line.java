package practicalTaskThree;

public class Line {
    private Point aPoint;
    private Point bPoint;

    public Line(Point p1, Point p2) {
        this.aPoint = p1;
        this.bPoint = p2;
    }

    public Point getP1() {
        return aPoint;
    }

    public Point getP2() {
        return bPoint;
    }

    @Override
    public String toString() {
        return "Line from " + aPoint + " to " + bPoint;
    }

    public void print() {
        System.out.println("Line: " + toString());
    }
}
