package kyu_8;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
В этом простом упражнении вы создадите программу, которая принимает значение, integer  и возвращает список его кратных
 до другого значения, limit . Если limit кратно integer, оно также должно быть включено.
 В функцию всегда будут передаваться только положительные целые числа, не состоящие из 0.
 Предел всегда будет выше базового.

Например, если переданные параметры равны (2, 6), функция должна вернуть [2, 4, 6] поскольку 2, 4 и 6 кратны от 2 до 6.
 */
public class Find_Multiples_of_a_Number {

    public static void main(String[] args) {
        int[] ints = Find_Multiples_of_a_Number.find(4, 27);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] find(int base, int limit) {
//        int[] arr = new int[limit / base];
//        int index = 0;
//        for (int i = base; i <= limit; i += base) {
//            arr[index] = i;
//            index++;
//        }
//        return arr;
        return IntStream.iterate(base, i -> i <= limit, i -> i + base).toArray();
    }
}
