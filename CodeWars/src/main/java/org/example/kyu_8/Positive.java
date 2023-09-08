package org.example.kyu_8;

/*
Вы получаете массив чисел, возвращаете сумму всех положительных значений.

Пример [1,-4,7,12] => 1 + 7 + 12 = 20

Примечание: если нечего суммировать, сумма по умолчанию равна 0.
 */
public class Positive {
    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, 3, 4, 5};
        System.out.println(Positive.sum(arr));
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            if (j >= 0) {
                sum += j;
            }
        }
        return sum;
    }
}
