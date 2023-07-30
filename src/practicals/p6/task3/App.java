package practicals.p6.task3;
/*
3*. Create three classes Point, Line, and ColorLine:
The "Point" class should have attributes "x" and "y".
The "Line" class should contain two objects of the "Point" class.
The "ColorLine" class should have an additional attribute "color", which extends the "Line" class.
Override toString() method and define print() method in every classes.
In main() method create an array of Line objects and add some instances of both Line and ColorLine to it.
Call the print() method for all objects in the array.

3*. Створіть три класи Point, Line і ColorLine:
Клас «Точка» повинен мати атрибути «x» і «y».
Клас «Лінія» повинен містити два об'єкти класу «Точка».
Клас "ColorLine" повинен мати додатковий атрибут "color", який розширює клас "Line".
Перевизначте метод toString() і визначте метод print() у кожному класі.
У методі main() створіть масив об’єктів Line і додайте до нього кілька екземплярів Line і ColorLine.
Викличте метод print() для всіх об’єктів у масиві.
 */

public class App {
    public static void main ( String[] args ) {
        Line[] lines = new Line[3];
        lines[0] = new Line(new Point(0, 0), new Point(5, 5));
        lines[1] = new ColorLine(new Point(5, 10), new Point(10, 20), "Red");
        lines[2] = new ColorLine(new Point(20, 30), new Point(50, 100), "Blue");

//        for (Line line : lines) {
//            line.print();
//        }

        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);

        }
    }
}
