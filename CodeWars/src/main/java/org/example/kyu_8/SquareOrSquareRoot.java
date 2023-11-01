package org.example.kyu_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Напишите метод, который получит массив целых чисел в качестве параметра и обработает каждое число из этого массива.

Возвращает новый массив с обработкой каждого числа входного массива следующим образом:

Если число имеет целый квадратный корень, примите это значение, в противном случае возведите число в квадрат.

Пример
[4,3,9,7,2,1] -> [2,9,3,49,4,1]
Примечания
Входной массив всегда будет содержать только положительные числа и никогда не будет пустым или null.
 */
public class SquareOrSquareRoot {
    public static void main(String[] args) {
        int[] array = new int[]{4, 3, 9, 7, 2, 1};

        System.out.println(Arrays.toString(squareOrSquareRoot(array)));
    }

    public static int[] squareOrSquareRoot(int[] array) {
        List<Integer> listNumber = new ArrayList<>();
        for (int j : array) {
            double sqrt = Math.sqrt(j);
            if (sqrt == (int) sqrt) {
                listNumber.add((int) sqrt);
            } else {
                int pow = (int) Math.pow(j, 2);
                listNumber.add(pow);
            }
        }

        int[] arr = new int[listNumber.size()];
        for (int i = 0; i < listNumber.size(); i++) {
            arr[i] = listNumber.get(i);
        }

        return arr;
    }
}
