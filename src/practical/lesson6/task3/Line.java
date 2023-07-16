package practical.lesson6.task3;

public class Line{
    Point a;
    Point b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "start: " + a +
                ", end: " + b;
    }

    public void print(){
        System.out.println(this.toString());
    }
}
