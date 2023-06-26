package myprojects.p3;
/*
�������� �� ����� QuadraticEquation � �������� �������� ��� ����'������ ���������� ������.
��� ������� ����������� ����������� ������� ( ax? + bx + c = 0 ), �������� ���� ��� ��� ����� �������, ���� ���� ������� � ������ ������ �����.
������ �������� �������� ����� System.in. ������� �������� �� ���� ����������� � System.out.
������ ��������:
"x? x?" (��� ����� � ����-����� �������, ������� �������), ���� � ��� �����
"x" (������ �������� ������), ���� � ������ �����
"no roots" (������ ������� �������� "��� ������"), ���� ������ ����.
�������� a ����������� �� ������� ����.
 */

import java.util.Locale;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == 0) {
            return;
        }

        double discriminant  = b * b - 4.0 * a * c;

        if (discriminant  > 0.0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
            System.out.println(x1 + x2);

        } else if (discriminant  == 0.0) {
            double x1 = -b / (2.0 * a);
            System.out.println(x1);

        } else {
            System.out.println("no roots");
        }
    }
}
