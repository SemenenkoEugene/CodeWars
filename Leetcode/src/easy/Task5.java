package easy;

import java.util.Arrays;

/*
Задан массив nums. Мы определяем текущую сумму массива как runningSum[i] = sum(nums[0]…nums[i]).
Возвращает текущую сумму nums.
Пример 1:
Входные данные: числа = [1,2,3,4]
Вывод: [1,3,6,10]
Объяснение: Текущая сумма получается следующим образом: [1, 1+2, 1+2+3, 1+2+3+4].

Пример 2:
Входные данные: числа = [1,1,1,1,1]
Вывод: [1,2,3,4,5]
Объяснение: Текущая сумма получается следующим образом: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

Пример 3:
Входные данные: числа = [3,1,2,10,1]
Вывод: [3,4,6,16,17]
 */
public class Task5 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = nums[i] + result[i - 1];
        }
        return result;
    }
}
