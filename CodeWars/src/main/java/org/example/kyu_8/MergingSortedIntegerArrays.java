package org.example.kyu_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Напишите функцию, которая объединяет два отсортированных массива в один.
Массивы содержат только целые числа. Кроме того, конечный результат должен быть отсортирован и не иметь дубликатов.
 */
public class MergingSortedIntegerArrays {
    public static void main(String[] args) {
        int[] arr1 = {-1,2,4,8};
        int[] arr2 = {4,6,8};

        int[] mergedArray = mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] first, int[] second) {
        List<Integer> mergedList = new ArrayList<>();
        Arrays.sort(first);
        Arrays.sort(second);
        int i = 0;
        int j = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mergedList.add(first[i]);
                i++;
            } else if (first[i] > second[j]) {
                mergedList.add(second[j]);
                j++;
            } else {
                mergedList.add(first[i]);
                i++;
                j++;
            }
        }
        while (i < first.length) {
            mergedList.add(first[i]);
            i++;
        }
        while (j < second.length) {
            mergedList.add(second[j]);
            j++;
        }
        int[] mergedArray = new int[mergedList.size()];
        for (int k = 0; k < mergedList.size(); k++) {
            mergedArray[k] = mergedList.get(k);
        }

        return mergedArray;
    }
}
