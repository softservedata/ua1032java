package myprojects.p3;

import java.util.Scanner;

/*
Напишіть програму, яка має прочитати два значення із System.in:
кількість людей
кількість шматочків в одній піці.
Гарантується, що вхідні параметри цілі позитивні числа.
Програма повинна надрукувати мінімальну кількість піц (не нуль), яку треба замовити, щоб у всіх була однакова кількість скибочок і не залишилося жодного зайвого.

                Arguments.of("3", "3 8"),
                Arguments.of("1", "2 8"),
                Arguments.of("1", "1 8"),
                Arguments.of("5", "5 8"),
                Arguments.of("7", "7 8"),
                Arguments.of("3", "3 5"),
                Arguments.of("2", "2 7"),
                Arguments.of("10", "10 1"),
                Arguments.of("1", "3 9"),
                Arguments.of("2", "4 6")
  */

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        int people = cs.nextInt();
        int pieces = cs.nextInt();

        int pizza = 1;
        int countOfPizzas = pieces;

        while (people > 0 ){
            pieces = countOfPizzas;
            pieces *= pizza;
            if (pieces % people == 0 ){
                break;
            }
            pizza++;
            }

        System.out.println(pizza);
    }
}

