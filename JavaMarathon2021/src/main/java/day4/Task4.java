package day4;

import java.util.Arrays;
import java.util.Random;

/**
 * 4. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 * Найти максимум среди сумм трех соседних элементов.
 * Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.
 * <p>
 * Пример:
 * *Для простоты пример показан на массиве размера 10
 * <p>
 * [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]
 * <p>
 * Тройка с максимальной суммой: [8742, 1040, 3254]
 * <p>
 * Вывод в консоль:
 * 13036
 * 7
 * <p>
 * *Пояснение. Первое число - сумма тройки [8742, 1040, 3254].
 * Второе число - индекс первого элемента тройки, то есть индекс числа 8742.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }

        int summaMax = 0;
        int summaIndex = 0;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }
            if (sum > summaMax) {
                summaMax = sum;
                summaIndex = i;
            }
        }
        System.out.println("Сумма максимальной тройки из массива: " + summaMax);
        System.out.println("Индекс элемента массива с которого начинается сумма максимальной тройки: " + summaIndex);
    }
}
