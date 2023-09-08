package org.example.kyu_6;

import java.math.BigInteger;

/*
Давайте определим две функции:

S(N) — sum of all positive numbers not more than N
S(N) = 1 + 2 + 3 + ... + N

Z(N) — sum of all S(i), where 1 <= i <= N
Z(N) = S(1) + S(2) + S(3) + ... + S(N)
Вам будет выдано целое число N в качестве входных данных; ваша задача - вернуть значение S(Z(N)).

Например, пусть N = 3:

Z(3) = 1 + 3 + 6 = 10
S(Z(3)) = S(10) = 55
Диапазон входных данных равен 1 <= N <= 10^9 и есть 80 ( 40 в LC ) тестовые примеры,
 большинство из которых являются случайными.
 */
public class SumOfSums {
    public static void main(String[] args) {
        System.out.println(SumOfSums.sumOfSums(100));
    }

    public static BigInteger sumOfSums(int n) {
        return getSumS(getSumZ(BigInteger.valueOf(n)));
    }

    private static BigInteger getSumZ(BigInteger n) {
        BigInteger sum = BigInteger.ZERO;
        for (BigInteger bi = n; bi.compareTo(BigInteger.ZERO) > 0; bi = bi.subtract(BigInteger.ONE)) {
            sum = sum.add(getSumS(bi));
        }
        return sum;
    }

    private static BigInteger getSumS(BigInteger n) {
        BigInteger sum = BigInteger.ZERO;
        for (BigInteger bi = n; bi.compareTo(BigInteger.ZERO) > 0; bi = bi.subtract(BigInteger.ONE)) {
            sum = sum.add(bi);
        }
        return sum;
    }

}
