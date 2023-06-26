package myprojects.p3;
/*
Перейдіть до класу QuadraticEquation і напишіть програму для розв'язання квадратних рівнянь.
Для заданих коефіцієнтів квадратного рівняння ( ax? + bx + c = 0 ), поверніть один або два корені рівняння, якщо вони існують у ділянці дійсних чисел.
Вхідне значення задається через System.in. Вихідне значення має бути надруковано у System.out.
Формат висновку:
"x? x?" (два корені в будь-якому порядку, розділені пробілом), якщо є два корені
"x" (просто значення кореня), якщо є єдиний корінь
"no roots" (просто рядкове значення "без коріння"), якщо кореня немає.
Параметр a гарантовано не дорівнює нулю.
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
