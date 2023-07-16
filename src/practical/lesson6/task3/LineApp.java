package practical.lesson6.task3;

public class LineApp {
    public static void main(String[] args) {
        Point A = new Point(10,5);
        Point B = new Point(-10,-5);

        A.print();
        B.print();


        Line [] arr = new Line[4];
        arr [0] = new ColorLine(A, B , "red");
        arr [1] = new ColorLine(A, B , "blue");
        arr [2] = new Line(A, B );
        arr [3] = new Line(A, B );

        for (int i=0; i< arr.length; i++){
            System.out.println("Line #" + (i+1)  + ":");
            arr[i].print();
        }


    }

}
