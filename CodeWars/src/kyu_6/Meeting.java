package kyu_6;

import java.util.*;
import java.util.stream.Collectors;

/*
Джон пригласил нескольких друзей. Его список таков:

s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
Не могли бы вы создать программу, которая

переводит эту строку в верхний регистр
сортирует его в алфавитном порядке по фамилии.
Если фамилии совпадают, отсортируйте их по имени. Фамилия и отчество гостя приводятся в результате в круглых скобках,
разделенных запятой.

Таким образом, результат функции meeting(s) будет:

"(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"
Может случиться так, что в двух разных семьях с одинаковой фамилией у двух людей тоже одинаковое имя.
 */
public class Meeting {
    public static void main(String[] args) {
        String s = "Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn";

        System.out.println(meeting(s));

    }

    public static String meeting(String s) {
        // your code
        String upperCase = s.toUpperCase();
        String[] strings = upperCase.split(";");
        Arrays.sort(strings, (a, b) -> {
            String[] nameA = a.split(":");
            String[] nameB = b.split(":");
            int compareTo = nameA[1].compareTo(nameB[1]);
            return (compareTo == 0) ? nameA[0].compareTo(nameB[0]) : compareTo;
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : strings) {
            String[] name = string.split(":");
            stringBuilder.append("(").append(name[1]).append(", ").append(name[0]).append(") ");
        }
        return stringBuilder.toString();
    }
}
