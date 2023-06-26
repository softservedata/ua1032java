package myprojects.p4;
/*
Реалізуйте метод getSumCheckArray.
Правильна реалізація повинна отримати масив значень int і повернути масив логічних значень, де кожен елемент є результатом перевірки:
чи відповідає вихідний елемент сумі цих двох попередніх елементів у масиві.
Подробиці:
Гарантується, що довжина даного масиву становить 2 або більше.
Даний масив гарантовано не рівен null.
Метод повертає масив логічних значень, де кожен елемент є результатом відповідного елемента в цьому масиві.
Перші два елементи логічного масиву завжди false.
 */

import java.util.Arrays;
public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};
        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }
    public static boolean[] getSumCheckArray(int[] array){

        int length = array.length;
        boolean[] result = new boolean[length];
        if (length >= 2) {
        result[0] = false;
        result[1] = false;
        for (int i = 2; i < length; i++) {

            int sum = array[i - 2] + array[i - 1];
                result[i] = array[i] == sum;
            }
        }
        //throw new UnsupportedOperationException();
        return result;
    }
}
