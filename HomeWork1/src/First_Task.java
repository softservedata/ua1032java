import java.util.Scanner;

public class First_Task {
    public static void first_task(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Radius");
        int r = sc.nextInt();
        float area = (float) (Math.PI*r*r);
        float perimeter = (float) (2*Math.PI*r);
        System.out.println("area = "+ area);
        System.out.println("perimeter = " + perimeter);

    }
}
