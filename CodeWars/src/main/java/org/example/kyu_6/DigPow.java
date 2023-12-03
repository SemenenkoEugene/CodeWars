package org.example.kyu_6;

import java.util.ArrayList;
import java.util.List;

/*
Некоторые числа обладают забавными свойствами. Например:

89 --> 8¹ + 9² = 89 * 1
695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2
46288 --> 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51
Учитывая два натуральных числа n и p, мы хотим найти положительное целое число k, если оно существует, такое, что сумма цифр n , возведенных в последовательные степени, начиная с p , равна k * n.

Другими словами, записывая последовательные цифры n как a, b, c, d ..., существует ли целое число k такое, что :
Если это так, мы вернем k, если нет, вернем -1.
Примечание: n и p всегда будут строго положительными целыми числами.

Примеры:
n = 89; p = 1 ---> 1 since 8¹ + 9² = 89 = 89 * 1
n = 92; p = 1 ---> -1 since there is no k such that 9¹ + 2² equals 92 * k
n = 695; p = 2 ---> 2 since 6² + 9³ + 5⁴= 1390 = 695 * 2
n = 46288; p = 3 ---> 51 since 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51
 */
public class DigPow {
    public static void main(String[] args) {
        System.out.println(digPow(46288, 3));


    }

    public static long digPow(int n, int p) {

        List<Integer> list = new ArrayList<>();
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            list.add(0, digit);
            temp = temp / 10;
        }
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            int pow = (int) Math.pow(list.get(i), p + i);
            result += pow;
        }
        int k = result / n;

        if (result == n * k) {
            return k;
        } else {
            return -1;
        }
    }
}
