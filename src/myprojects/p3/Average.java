package myprojects.p3;
/*
��������, ��� ����� ����������� ����� ������� � ������������ �������� � ��������� ������ ��������.
���������:
�� ������ ��������� �������� �����������, ���� �������� �� ����� 0. ������� �������� ������ ����� ������ ����������� �� �� � �� ��������.
����������� ����������� ������ ��� ���� ��������.
������ �������� ����� � ����� ������. �������������� ��� ��������.
 */
import java.util.Scanner;

public class Average {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

//        while (true) {
//            int value = scanner.nextInt();
//            if (value == 0) {
//                break;
//            }
//            sum = sum + value;
//            count++;
//        }

        for (int value = scanner.nextInt(); value != 0; value = scanner.nextInt()) {
            sum = sum + value;
            count = count + 1;
            //count++;
        }
        int average = sum / count;
        System.out.println(average);
        scanner.close();
    }
}