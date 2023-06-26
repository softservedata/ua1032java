package myprojects.p4;

/*
Реалізуйте метод `sum`.
Правильна реалізація повинна отримати масив значень `int` і повернути суму парних чисел.
Подробиці:
- Якщо даний масив рівнів нулю або пустим, метод повертає 0.
- Метод `sum` не повинен змінювати масив.
- Вхідний масив може містити будь-яке значення типу `int` від `Integer.MIN_VALUE` до `Integer.MAX_VALUE` .
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
