package random;
import java.util.Random;
/**
 * клас для генерації випадкових чисел
 */
public class Rand {
    private Random rn = new Random();
    /**
     * генерує випадкове число у заданому діапазоні
     *
     * @param maxNum найбільше значення випадкового числа
     * @return ціле число
     */
    public int randInt(int maxNum) {
        return rn.nextInt(maxNum);
    }
}