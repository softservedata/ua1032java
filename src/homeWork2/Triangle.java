package homeWork2;

public class Triangle {
    private int a;
    private int b;
    private int c;
    private int p;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setP (){
        p = a + b+ c;
    }
    public double getArea() {
        return  Math.sqrt(p*((p-a)*(p-b)*(p-c)));
    }
}
