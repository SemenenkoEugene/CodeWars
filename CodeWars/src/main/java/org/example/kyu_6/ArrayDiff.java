package org.example.kyu_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Ваша цель в этом ката - реализовать функцию разности, которая вычитает один список из другого и возвращает результат.

Он должен удалить из списка все значения, a которые присутствуют в списке b, сохраняя их порядок.

Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
Если значение присутствует в b, все его вхождения должны быть удалены из другого:

Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
 */
public class ArrayDiff {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 2, 2, 3};
        int[] b = new int[]{2};
        System.out.println(Arrays.toString(arrayDiff(a, b)));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        // Your code here
        List<Integer> result = new ArrayList<>();
        for (int num : a) {
            if (!contains(b, num)) {
                result.add(num);
            }
        }
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static boolean contains(int[] b, int target) {
        for (int num : b) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
