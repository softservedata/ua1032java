package com.softserve.practicals.p11.task3;
/*
The task requires validation of usernames using regular expressions.
The username should be between 3 to 15 characters and can contain only Latin alphabet, numbers, and underscores.
To accomplish this, input five different usernames in the main method and output a message to the
console indicating whether each of the entered names is valid or not.

�������� ������ �������� ���� ������������ �� ��������� ���������� ������.
��� ����������� �� ������ �� 3 �� 15 ������� � ���� ������ ���� ���������� ������, ����� �� ������� �����������.
��� ������� �����, ������ ���� ����� ���� ������������ � �������� ����� � ������� ����������� ��
�������, �� �����, �� ����� � �������� ���� � ������ �� �.
 */


import java.util.Scanner;

public class App {

        public static void main(String[] args) {
            Scanner scanner = new Scanner( System.in );
            System.out.println( "������ �'��� ����� ���� ������������:" );

            for (int i = 0; i < 5; i++) {
                System.out.print( "��'� ����������� " + (i + 1) + ": " );
                String username = scanner.nextLine( );

                if ( username.matches( "^[a-zA-Z0-9_]{3,15}$" ) ) {
                    System.out.println( "��'� ����������� " + (i + 1) + " � ������." );
                } else {
                    System.out.println( "��'� ����������� " + (i + 1) + " �������." );
                }
            }
            scanner.close( );
        }
}

