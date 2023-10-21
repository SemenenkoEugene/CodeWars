package org.example.kyu_8;

/*
Введение
Первое столетие охватывает период с года 1 по включительно 100 год, второе столетие -
со 101 по год включительно 200 год и т.д.

Задача
Для заданного года верните столетие, в котором он находится.

Примеры
1705 --> 18
1900 --> 19
1601 --> 17
2000 --> 20
 */
public class CenturyFromYear {
    public static void main(String[] args) {
        System.out.println(century(2000));
    }
    public static int century(int number) {
        if (number % 100 == 0) {
            return number / 100;
        } else {
            return (number / 100) + 1;
        }
    }
}
