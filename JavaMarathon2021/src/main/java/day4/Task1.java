package day4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера
 * и заполнить его случайными числами от 0 до 10 (включительно). Используя цикл for each вывести
 * содержимое массива в консоль, а также вывести в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 * <p>
 * Пример:
 * Введено число 10. Сгенерирован следующий массив:
 * [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
 * <p>
 * Информация о массиве:
 * Длина массива: 10
 * Количество чисел больше 8: 1
 * Количество чисел равных 1: 0
 * Количество четных чисел: 6
 * Количество нечетных чисел: 4
 * Сумма всех элементов массива: 46
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        int count = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int summa = 0;
        for (int i : array) {
            System.out.print(i + " ");
            if (i > 8) {
                count++;
            }
            if (i == 1) {
                b++;
            }
            if (i % 2 == 0) {
                c++;
            }
            if (i % 2 != 0) {
                d++;
            }
            summa += i;

        }
        System.out.println();
        System.out.println("Длина массива: " + n);
        System.out.println("Количество чисел больше 8: " + count);
        System.out.println("Количество чисел равных 1: " + b);
        System.out.println("Количество четных чисел: " + c);
        System.out.println("Количество нечетных чисел: " + d);
        System.out.println("Сумма всех элементов массива: " + summa);
    }

}
