package org.example.kyu_7;

import java.util.HashMap;
import java.util.Map;

/*
В этом ката вам будет предоставлен массив чисел, в котором два числа встречаются один раз, а остальные - только дважды.
Вашей задачей будет вернуть сумму чисел, которые встречаются только один раз.

Например, repeats([4,5,7,5,4,8]) = 15 потому что только числа 7 и 8 встречаются один раз, а их сумма равна 15.
Каждое другое число встречается дважды.
 */
public class Repeats {
    public static void main(String[] args) {
        System.out.println(repeats(new int[]{4, 5, 7, 5, 4, 8}));
    }

    public static int repeats(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i : arr) {
            if (countMap.containsKey(i)) {
                countMap.put(i, countMap.get(i) + 1);
            } else {
                countMap.put(i, 1);
            }
        }

        int sum = 0;
        for (Integer number : countMap.keySet()) {
            if (countMap.get(number) == 1) {
                sum += number;
            }
        }
        return sum;
    }
}
