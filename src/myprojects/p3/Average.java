package myprojects.p3;
/*
Програма, яка зчитує послідовність цілих значень зі стандартного введення і знаходить середнє значення.
Подробиці:
Ви повинні зчитувати значення послідовності, доки наступне не стане 0. Нульове значення означає кінець вхідної послідовності та не є її частиною.
Послідовність гарантовано містить хоч одне значення.
Середнє значення також є цілим числом. Використовуйте цілі операції.
 */
import java.util.Scanner;

public class Average {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

//        while (true) {
//            int value = scanner.nextInt();
//            if (value == 0) {
//                break;
//            }
//            sum = sum + value;
//            count++;
//        }

        for (int value = scanner.nextInt(); value != 0; value = scanner.nextInt()) {
            sum = sum + value;
            count = count + 1;
            //count++;
        }
        int average = sum / count;
        System.out.println(average);
        scanner.close();
    }
}