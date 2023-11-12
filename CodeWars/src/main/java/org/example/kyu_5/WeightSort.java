package org.example.kyu_5;

import java.util.Arrays;

/*
Мы с моим другом Джоном являемся членами клуба "Fat to Fit Club (FFC)".
Джон обеспокоен, потому что каждый месяц публикуется список с весами участников,
и каждый месяц он последний в списке, что означает, что он самый тяжелый.

Я тот, кто составляет список, поэтому я сказал ему: "Больше не волнуйся, я изменю порядок в списке".
Было решено приписать числам "вес". Отныне вес числа будет равен сумме его цифр.

Например, 99 будет иметь "вес"18, 100 будет иметь "weight", 1 поэтому в списке 100 будет стоять перед 99.
Учитывая строку с весами членов FFC в обычном порядке, можете ли вы привести эту строку в порядке "весов" этих чисел?

Пример:
"56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes:

""100 180 90 56 65 74 68 86 99"
Когда два числа имеют одинаковый "вес", давайте классифицируем их так, как если бы они были строками (в алфавитном порядке),
а не числами: 180 предшествует, 90 поскольку, имея тот же "вес" (9), она предшествует в виде струны.
Все числа в списке являются положительными числами, и список может быть пустым.
Примечания
может случиться так, что строка ввода содержит начальные и конечные пробелы и более одного уникального пробела между
двумя последовательными числами
 */
public class WeightSort {
    public static void main(String[] args) {
        String s = "56 65 74 100 99 68 86 180 90";
        String result = orderWeight(s);
        System.out.println(result);

    }

    public static String orderWeight(String strng) {
        if (strng == null) {
            return strng;
        }

        String trimmed = strng.trim(); //обрезаем пробелы
        String[] strings = trimmed.split("\\s+"); //массив подстрок

        Arrays.sort(strings, (o1, o2) -> {
            int weight1 = getWeight(o1);
            int weight2 = getWeight(o2);

            if (weight2 == weight1) {
                return o1.compareTo(o2);
            } else {
                return Integer.compare(weight1, weight2);
            }
        });
        return String.join(" ", strings);

    }

    private static int getWeight(String number) {
        int weight = 0;
        char[] digits = number.toCharArray();

        for (char digit : digits) {
            weight += Character.getNumericValue(digit);
        }

        return weight;
    }
}
