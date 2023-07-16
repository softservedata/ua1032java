package practical.lesson6.task3;

public class Point {
    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x +
                ", " + y +
                ")";
    }

    public void print(){
        System.out.println(this.toString());
    }
}
