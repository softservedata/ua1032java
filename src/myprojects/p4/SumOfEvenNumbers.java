package myprojects.p4;

/*
��������� ����� `sum`.
��������� ��������� ������� �������� ����� ������� `int` � ��������� ���� ������ �����.
���������:
- ���� ����� ����� ���� ���� ��� ������, ����� ������� 0.
- ����� `sum` �� ������� �������� �����.
- ������� ����� ���� ������ ����-��� �������� ���� `int` �� `Integer.MIN_VALUE` �� `Integer.MAX_VALUE` .
 */

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
    }

    public static int sum(int[] array) {
        if ( array == null || array.length == 0 ) {
            return 0;
        }
        int sum = 0;
        for (int num : array) {
            if ( num % 2 == 0 ) {
                sum = sum + num;
            }
        }
        return sum;
    }
        //throw new UnsupportedOperationException();
}
