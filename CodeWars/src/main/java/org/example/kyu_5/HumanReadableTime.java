package org.example.kyu_5;

/*
Напишите функцию, которая принимает неотрицательное целое число (секунды) в качестве входных данных
и возвращает время в удобочитаемом формате (HH:MM:SS)

HH = часы, дополненные 2 цифрами, диапазон: 00 - 99
MM = минуты, дополненные 2 цифрами, диапазон: 00 - 59
SS = секунды, дополненные до 2 цифр, диапазон: 00 - 59
Максимальное время никогда не превышает 359999 (99:59:59)
 */
public class HumanReadableTime {
    public static void main(String[] args) {
        System.out.println(makeReadable(3601));
    }

    public static String makeReadable(int seconds) {
        int hour = seconds / 3600;
        int minute = seconds / 60 % 60;
        int second = seconds % 60;

        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
