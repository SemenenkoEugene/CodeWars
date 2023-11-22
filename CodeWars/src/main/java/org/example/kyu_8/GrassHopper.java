package org.example.kyu_8;

/*
Найти значение
Найдите среднее значение списка чисел в массиве.

Информация
Чтобы найти среднее значение набора чисел, сложите все числа вместе и разделите на количество значений в списке.

Для примера приведен список 1, 3, 5, 7

1. Добавьте все числа

1+3+5+7 = 16
2. Разделите на количество значений в списке. В этом примере в списке 4 числа.

16/4 = 4
3. Среднее значение (или average) в этом списке равно 4
 */
public class GrassHopper {
    public static void main(String[] args) {
        System.out.println(findAverage(new int[]{1, 3, 5, 7}));
    }

    public static int findAverage(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum/nums.length;
    }
}
