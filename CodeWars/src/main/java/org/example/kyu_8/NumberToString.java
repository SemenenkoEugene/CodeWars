package org.example.kyu_8;

/*
Нам нужна функция, которая может преобразовывать число (integer) в строку.

Какие способы достижения этого вы знаете?

Примеры (ввод -> вывод):
123  --> "123"
999  --> "999"
-100 --> "-100"
 */
public class NumberToString {
    public static String numberToString(int num) {
        return String.valueOf(num);
    }
}
