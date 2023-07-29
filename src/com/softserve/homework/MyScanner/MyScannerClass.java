package com.softserve.homework.MyScanner;

import java.util.Scanner;

public class MyScannerClass implements AutoCloseable {
    // ���� ��� ��������� ��'���� Scanner
    private Scanner scanner;

    // ����������� �����, � ����� ���������� ��'��� Scanner
    public MyScannerClass() {
        scanner = new Scanner(System.in);
    }

    // ����� ��� ������� ������������� �������
    public int readInt() {
        return scanner.nextInt();
    }

    // ����� ��� ������� ������ (� ��������� ������) �������
    public double readDouble() {
        return scanner.nextDouble();
    }

    // ����� ��� ������� �����
    public String readString() {
        return scanner.nextLine();
    }

    // ����� ��� ������� �������
    public char readChar() {
        return scanner.next().charAt(0);
    }

    // ����� ��� �������� Scanner ���� ������������
    public void closeScanner() {
        scanner.close();
    }

    @Override
    public void close () throws Exception {

    }
}