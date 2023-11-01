package org.example.kyu_7;

import java.util.HashMap;
import java.util.Map;

/*
Завершите функцию, чтобы найти количество наиболее часто встречающихся элементов массива.
Можно предположить, что входные данные представляют собой массив целых чисел. Для пустого массива верните 0

Пример
input array: [3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3]
ouptut: 5
Наиболее частым числом в массиве является, -1 и оно встречается 5 раз.
 */
public class MostFrequentItemCount {
    public static void main(String[] args) {
        int[] inputArray = new int[]{3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        System.out.println(mostFrequentItemCount(inputArray));
    }

    public static int mostFrequentItemCount(int[] collection) {
        if (collection.length == 0) {
            return 0;
        }
        Map<Integer, Integer> number = new HashMap<>();
        int maxFrequency = 0;

        for (int num : collection) {
            int frequency = number.getOrDefault(num, 0) + 1;
            number.put(num, frequency);
            maxFrequency = Math.max(maxFrequency, frequency);
        }

        return maxFrequency;
    }
}
