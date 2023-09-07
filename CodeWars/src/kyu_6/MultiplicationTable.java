package kyu_6;/*
Ваша задача - создать таблицу умножения N × N размера, указанного в параметре.

Например, когда задано size равно 3:

1 2 3
2 4 6
3 6 9
Для данного примера возвращаемое значение должно быть:

[[1,2,3],[2,4,6],[3,6,9]]
 */

import java.util.Arrays;

public class MultiplicationTable {
        public static void main(String[] args) {
        System.out.println(Arrays.deepToString(multiplicationTable(3)));
    }

    public static int[][] multiplicationTable(int n) {
        int[][] array = new int[n][n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                array[i-1][j-1] = i * j;
            }
        }
        return array;
    }
}