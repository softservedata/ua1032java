package myprojects.p3;
import java.util.Scanner;
public class FindMaxInSeq {
    public static int max() {
        Scanner sc = new Scanner(System.in);
        int currValue = sc.nextInt();
        int maxSoFar = currValue;

//        while (true) {
//            currValue = sc.nextInt();
//            if(currValue == 0) break;
//            if (currValue >= maxSoFar ) {
//                maxSoFar = currValue;
//            }
//        }
        do {
            currValue = sc.nextInt();
            if (currValue > maxSoFar){
                maxSoFar = currValue;
            }
        }
        while (currValue !=0);

        return maxSoFar;
    }
    public static void main(String[] args) {
        System.out.println("Test your code here!\n");
        FindMaxInSeq test = new FindMaxInSeq();
        System.out.println(max());
    }
}