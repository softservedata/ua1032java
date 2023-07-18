package com.softserve.homework.hw10.task1;
/*
Develop parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
realizing the operations of union and intersection of two sets.
Test the operation of these techniques on two pre-filled sets.

��������� �������������� ������ ��'������� (Set set1, Set set2) � ��������� (Set set1, Set set2),
��������� �������� ��'������� � ��������� ���� ������.
�������� ������ ��� ������ �� ���� ���������� ���������� �������.

 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

 class App {
    public static void main(String[] args) {
        Set<Object> s1 = new HashSet<>(Arrays.asList("one", 2, 3, 4, null));
        Set<Object> s2 = new HashSet<>(Arrays.asList(1, null, 5, "one", 3));
        SetOperations.union( s1, s2 );
        SetOperations.intersect( s1, s2 );
    }
}

