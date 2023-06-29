package com.softserve.homework.hw03.task4;
/*
��������� ���� ����
� ������� ���� ϳ����� ����� �������� ��� ���� ������� � ���� ����������� �� ����:
����� � �� 1 ������� �� 31 ������
˳�� � �� 1 ������ �� 31 ������
���� � �� 1 ������� �� 30 ���������
���� � �� 1 ������ �� 28 ������ (� �������� ���� � �� 29 ������)
 */

public enum Season {
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn"),
    WINTER("Winter");

    private final String name;

    Season ( String name ) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    @Override
    public String toString () {
        return "Season{" +
                "name= '" + name + '\'' +
                '}';
    }
}



