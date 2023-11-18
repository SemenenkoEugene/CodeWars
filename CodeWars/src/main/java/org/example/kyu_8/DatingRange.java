package org.example.kyu_8;

/*
Всем известно классическое правило знакомств "вдвое моложе тебя плюс семь",
которому следуют многие люди (включая меня). Это "рекомендуемый" возрастной диапазон для свиданий с кем-либо.


minimum age <= your age <= maximum age

Задача
Учитывая целое число (1 <= n <= 100), представляющее возраст человека,
верните его минимальный и максимальный возрастные диапазоны.

Это уравнение не работает, когда возраст <= 14, поэтому используйте вместо него это уравнение:

min = age - 0.10 * age
max = age + 0.10 * age
Вы должны заполнять все свои ответы так, чтобы вместо числа с плавающей точкой указывалось целое число (которое не представляет возраст). Return your answer in the form [min]-[max]

##Примеры:

age = 27   =>   20-40
age = 5    =>   4-5
age = 17   =>   15-20
 */
public class DatingRange {
    public static void main(String[] args) {
        System.out.println(datingRange(10));
    }

    public static String datingRange(int age) {
        int minAge;
        int maxAge;
        if (age > 14) {
            minAge = (age / 2) + 7;
            maxAge = (age - 7) * 2;
        } else {
            minAge = (int) (age - 0.1 * age);
            maxAge = (int) (age + 0.1 * age);
        }
        return String.format("%d-%d", minAge, maxAge);
    }
}
