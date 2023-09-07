package Sprint17_17.Theme1_4.Lesson3_5;

import java.util.Arrays;

public class Practicum {
    public static void main(String[] args) {
        int[] arrayAsc = {1, 2, 5, 8, 12, 13, 20, 22, 24, 30, 32};

        int[] arrayDesc = {32, 30, 24, 22, 20, 13, 12, 8, 5, 2, 1};

        System.out.println("Индекс искомого элемента: " + searchBinaryAscending(arrayAsc, 30));
        System.out.println("Индекс искомого элемента: " + searchBinaryDescending(arrayDesc, 30));
        System.out.println("Индекс искомого элемента: " + searchBinary(arrayAsc, 30));
        System.out.println("Индекс искомого элемента: " + searchBinary(arrayDesc, 30));
    }

    private static int searchBinary(int[] array, int elem) {
        // возвращает 1, если массив отсортирован по возрастанию, и -1, если по убыванию
        int sort = getSortRecursive(array, 0, 1);
        if (sort > 0) {
            return searchBinaryAscending(array, elem);
        } else if (sort < 0) {
            return searchBinaryDescending(array, elem);
        } else {
            return -1;
        }
    }

    private static int getSortRecursive(int[] array, int sort, int next) {
        // рекурсивно сравните каждый следующий элемент с предыдущим
        if (next >= array.length) {
            if (sort > 0) {
                return 1; // массив отсортирован по возрастанию
            } else if (sort < 0) {
                return -1; // массив отсортирован по убыванию
            } else {
                return 0; // массив не отсортирован
            }
        }

        int current = array[next];
        int previous = array[next - 1];

        if (sort == 0) {
            sort = current - previous;
        } else if ((sort > 0 && current - previous < 0) || (sort < 0 && current - previous > 0)) {
            return 0; // массив уже не отсортирован
        }

        return getSortRecursive(array, sort, next + 1);
    }

    private static int searchBinaryDescending(int[] arrayDesc, int element) {
        return searchBinaryRecursiveDescending(arrayDesc, element, 0, arrayDesc.length - 1);
    }

    private static int searchBinaryRecursiveDescending(int[] array, int elem, int low, int high) {
        if (high <= low) { // промежуток пуст
            return -1;
        }
        // промежуток не пуст
        int mid = low + ((high - low) / 2);
        if (array[mid] == elem) { // центральный элемент — искомый
            return mid;
        } else if (elem < array[mid]) { // на этот раз искомый элемент больше центрального
            // все элементы больше центрального и располагаются в левой половине
            return searchBinaryRecursiveDescending(array, elem, mid + 1, high);
        } else { // иначе следует искать в правой половине
            return searchBinaryRecursiveDescending(array, elem, low, mid);
        }
    }

    private static int searchBinaryAscending(int[] arrayAsc, int element) {
        return searchBinaryRecursive(arrayAsc, element, 0, arrayAsc.length - 1);
    }

    private static int searchBinaryRecursive(int[] array, int elem, int low, int high) {
        if (high <= low) { // промежуток пуст
            return -1;
        }
        // промежуток не пуст
        int mid = low + ((high - low) / 2);
        if (array[mid] == elem) { // центральный элемент — искомый
            return mid;
        } else if (elem < array[mid]) { // искомый элемент меньше центрального — значит, следует искать в левой половине
            return searchBinaryRecursive(array, elem, low, mid);
        } else { // иначе следует искать в правой половине
            return searchBinaryRecursive(array, elem, mid + 1, high);
        }
    }
}
