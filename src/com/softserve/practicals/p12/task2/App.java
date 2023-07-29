package com.softserve.practicals.p12.task2;
/*
To complete the given task, it is required to create a class named Plant which includes the following fields: int size, Color color (an Enum), Type type (an Enum)
A constructor must be created to initialize these fields. The toString() method should be overridden to provide a string representation of the Plant object.
Two separate classes named ColorException and TypeException should be created to describe all possible colors and types of plants respectively.
In the main() method, an array of five plants should be created, and it should be ensured that the exception handling is working correctly for invalid color and type values.
**Add a method that will verify whether the size of the plant is correct and throw an exception if it is too small or too large.
**Add a method that will verify whether the color and type are both valid and throw an exception if invalid parameters are entered.

Для виконання даного завдання необхідно створити клас Plant, який містить такі поля: int size, Color color (an Enum), Type type (an Enum)
Для ініціалізації цих полів необхідно створити конструктор. Метод toString() має бути перевизначений, щоб забезпечити рядкове представлення об’єкта Plant.
Слід створити два окремих класи з іменами ColorException і TypeException для опису всіх можливих кольорів і типів рослин відповідно.
У методі main() слід створити масив із п’яти заводів і переконатися, що обробка винятків працює правильно для недійсних значень кольору та типу.
**Додайте метод, який перевірятиме, чи правильний розмір рослини, і створюватиме виняток, якщо він замалий або завеликий.
**Додайте метод, який перевірятиме, чи дійсні колір і тип, і створюватиме виняток, якщо введено недійсні параметри.
 */

public class App {
//    1.
    public enum Color {WHITE, RED , BLUE}

    //    2.
    public static class ColorException extends Exception {
        public ColorException ( String arg0 ) {
            super( arg0 );
        }
    }
    public enum Type{ ROSE, B, C}

    public static class TypeException extends Exception {
        public TypeException ( String arg0 ) {
            super( arg0 );
        }
    }
    private Type typeStrToEnum ( String type ) {
        return Type.ROSE;
    }



    //3.
    public class Plant {
        private Type type;
        private Color color;
        private int size;

        public Plant ( String type, String color, int size ) throws ColorException, TypeException {
            Color c = colorStrToEnum( color );
            Type t = typeStrToEnum( type );
            this.size = size;
            this.type = t;
            this.color = c;
        }



        private Color colorStrToEnum ( String color ) throws ColorException {
            switch (color.toLowerCase( )) {
                case "blue":
                    return Color.BLUE;
                case "red":
                    return Color.RED;
                case "white":
                    return Color.WHITE;
                default:
                    throw new ColorException( "Input only color blue, red or white" );
            }
        }

        @Override
        public String toString () {
            return null;
        }

        //4.
//        public static void main ( String[] args ) {
//            try {
//                Plant pl = new Plant( "ROSE", "BLUE", 5 );
//                System.out.println( pl );
//            } catch (ColorException | TypeException e) {
//                System.err.println( e.getMessage( ) + "\n" );
//                //e.printStackTrace();
//            }
//        }

    }
}
