package myprojects.p4;
/*
Перейдіть в клас MaxMethod і реалізуйте метод max.
Правильна реалізація повинна отримати масив значень типу int і повернути його максимальне значення.
Подробиці:
Вхідний масив гарантовано не буде пустим або null.
Метод max не повинен змінювати масив.
Вхідний масив може містити будь-яке значення типу int від Integer.MIN_VALUE до Integer.MAX_VALUE.
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