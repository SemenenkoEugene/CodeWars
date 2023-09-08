package org.example.kyu_8;

/*
Входные данные: массив элементов

["h","o","l","a"]

Вывод: строка с элементами массива, разделенными запятыми, в том же порядке.

"h,o,l,a"
 */
public class ArrayPrinter {
    public static void main(String[] args) {
        Object[] arr = new Integer[]{2, 4, 5, 2};
        System.out.println(ArrayPrinter.printArray(arr));
    }

    public static String printArray(Object[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            Object o = array[i];
            if (i == array.length - 1) {
                stringBuilder.append(o);
            } else {
                stringBuilder.append(o).append(",");
            }
        }
        return stringBuilder.toString();
    }
}
