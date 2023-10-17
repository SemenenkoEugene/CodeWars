package org.example.kyu_6;
/*
Учитывая массив целых чисел, найдите то, которое появляется нечетное число раз.

Всегда будет только одно целое число, которое появляется нечетное количество раз.

Примеры
[7] должен вернуться 7, потому что это происходит 1 раз (что странно).
[0] должен вернуться 0, потому что это происходит 1 раз (что странно).
[1,1,2] должен вернуться 2, потому что это происходит 1 раз (что странно).
[0,1,0,1,0] должен вернуться 0, потому что это происходит 3 раза (что странно).
[1,2,2,3,3,3,4,3,3,3,2,2,1] должен вернуться 4, потому что он появляется 1 раз (что странно).
 */

import java.util.HashMap;
import java.util.Map;

public class FindTheOddInt {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 3, 1};
        System.out.println(findIt(arr));
    }

    public static int findIt(int[] a) {
        Map<Integer, Integer> arrMap = new HashMap<>();

        for (int num : a) {
            if (arrMap.containsKey(num)) {
                arrMap.put(num, arrMap.get(num) + 1);
            } else {
                arrMap.put(num, 1);
            }
        }

        for (Integer num : arrMap.keySet()) {
            if (arrMap.get(num) %2!=0){
                return num;
            }
        }
        throw new IllegalArgumentException("Неверный ввод массива");
    }
}
