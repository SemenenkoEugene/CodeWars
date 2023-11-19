package org.example.kyu_8;

/*
Найдите сумму всех значений, кратных n приведенным ниже m

Имейте в виду
n и m являются натуральными числами (целыми положительными числами)
m исключается из кратных
Примеры
Kata.sumMul(2, 9)   ==> 2 + 4 + 6 + 8 = 20
Kata.sumMul(3, 13)  ==> 3 + 6 + 9 + 12 = 30
Kata.sumMul(4, 123) ==> 4 + 8 + 12 + ... = 1860
Kata.sumMul(4, -7)  // throws IllegalArgumentException
 */
public class SumMul {
    public static void main(String[] args) {
        System.out.println(sumMul(4, 123));
    }

    public static long sumMul(int n, int m) {
        if (n <= 0 || m <= 0) {
            throw new IllegalArgumentException();
        }
        int sum = 0;
        for (int i = n; i < m; i = i + n) {
            sum = sum + i;
        }
        return sum;
    }
}
