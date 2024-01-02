package org.example.kyu_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/*
Завершите функцию, которая принимает два целых числа (a, b, где a < b) и
возвращает массив всех целых чисел между входными параметрами, включая их.

Например:

a = 1
b = 4
--> [1, 2, 3, 4]
 */
public class Between {

    public static int[] between(int a, int b) {
//        List<Integer> numbers = new ArrayList<>();
//        for (int i = a; i <= b; i++) {
//            numbers.add(i);
//        }
//        return numbers.stream()
//                .mapToInt(Integer::intValue)
//                .toArray();
        return IntStream.rangeClosed(a, b).toArray();
    }
}
