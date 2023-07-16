package practical.lesson6.task3;

public class ColorLine extends Line{
    private String color;

    public ColorLine(Point a, Point b, String color) {
        super(a, b);
        this.color = color;
    }

    @Override
    public String toString() {
        return "color : " + color +
                ", start: " + a +
                ", end: " + b;

    }

}
