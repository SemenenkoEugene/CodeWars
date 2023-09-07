package kyu_8;

import java.util.Arrays;
import java.util.OptionalInt;

/*
Учитывая массив целых чисел, ваше решение должно найти наименьшее целое число.

Например:

Учитывая, что [34, 15, 88, 2] ваше решение вернет 2
Учитывая, что [34, -345, -1, 100] ваше решение вернет -345
Для целей этого kata можно предположить, что предоставленный массив не будет пустым.
 */
public class Find_the_smallest_integer_in_the_array {
    public static void main(String[] args) {
        int[] arr = new int[]{34, 15, 88, 2};

        int smallestInt = Find_the_smallest_integer_in_the_array.findSmallestInt(arr);
        System.out.println(smallestInt);
    }

    public static int findSmallestInt(int[] args) {
        OptionalInt min = Arrays.stream(args)
                .min();
        return min.isPresent() ? min.getAsInt() : 0;
    }
}
