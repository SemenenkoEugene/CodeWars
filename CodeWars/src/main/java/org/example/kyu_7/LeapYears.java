package org.example.kyu_7;

/*
В этом ката вы должны просто определить, является ли данный год високосным или нет.
На случай, если вы не знаете правил, вот они:

Годы, кратные 4, являются високосными,
но годы, кратные 100, не являются не високосными годами,
но годы, кратные 400, являются високосными годами.
Проверенные годы находятся в пределах допустимого диапазона 1600 ≤ year ≤ 4000.
 */
public class LeapYears {
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 &&(year % 400 == 0 || year % 100 != 0);
    }
}
