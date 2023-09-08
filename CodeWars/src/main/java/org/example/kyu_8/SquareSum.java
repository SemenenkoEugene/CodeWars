package org.example.kyu_8;

/*
Завершите функцию квадратной суммы так, чтобы она возводила в квадрат каждое переданное в нее число, а затем суммировала результаты вместе.

Например, для [1, 2, 2] оно должно вернуться 9, потому что 12+22+22=9 12 +22 +22 =9
 */
public class SquareSum {
    public static void main(String[] args) {
        int[] arr = new int[]{5, -3, 4};
        System.out.println(SquareSum.squareSum(arr));
    }

    public static int squareSum(int[] n) {
        int sum = 0;
        for (int number : n) {
            sum += number * number;
        }
        return sum;
    }
}
