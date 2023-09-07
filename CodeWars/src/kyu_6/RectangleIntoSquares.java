package kyu_6;

import java.util.ArrayList;
import java.util.List;

/*
Можете ли вы преобразовать этот рисунок в алгоритм?

Вам будут предоставлены два измерения

целочисленная положительная длина
целочисленная положительная ширина
Вы вернете коллекцию или строку (в зависимости от языка; Shell bash, PowerShell, Pascal и Fortran возвращают строку)
 с размером каждого из квадратов.

Примеры в общем виде:
(в зависимости от языка)

  sqInRect(5, 3) should return [3, 2, 1, 1]
  sqInRect(3, 5) should return [3, 2, 1, 1]

  You can see examples for your language in **"SAMPLE TESTS".**
 */
public class RectangleIntoSquares {
    public static void main(String[] args) {
        System.out.println(sqInRect(5,3));
        System.out.println(sqInRect(3,5));
    }

    public static List<Integer> sqInRect(int lng, int wdth) {
        // your code
        List<Integer> squares = new ArrayList<>();
        if (lng == wdth) {
            return null;
        }
        while (lng > 0 && wdth > 0) {
            if (lng > wdth) {
                squares.add(wdth);
                lng = lng - wdth;
            } else {
                squares.add(lng);
                wdth = wdth - lng;
            }
        }
        return squares;
    }
}
