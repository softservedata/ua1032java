package myprojects.p4;
/*
�������� � ���� MaxMethod � ��������� ����� max.
��������� ��������� ������� �������� ����� ������� ���� int � ��������� ���� ����������� ��������.
���������:
������� ����� ����������� �� ���� ������ ��� null.
����� max �� ������� �������� �����.
������� ����� ���� ������ ����-��� �������� ���� int �� Integer.MIN_VALUE �� Integer.MAX_VALUE.
 */

public class MaxMethod {
    public static int max( int[] values) {
       //throw new UnsupportedOperationException();
    int max = values [0];
    for (int i = 1; i < values.length; i++)
            if (values[i] > max)
    max = values[i];

    return max;
}

    public static void main(String[] args) {
        int[] intArray = {-794, -206, -500, -410, -850, -249, -968, -536, -61, -65, -866};
        System.out.println(max(intArray));
    }
}