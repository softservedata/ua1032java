package practicalTaskThree;

public class ColorLine extends Line{
    private String color;

    public ColorLine(Point p1, Point p2, String color) {
        super(p1, p2);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + ", color: " + color;
    }

    public void print() {
        System.out.println("~ColorLine: " + toString());
    }
}
