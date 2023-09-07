package org.example.kyu_8;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Вам будет предоставлен список строк. Вы должны отсортировать его в алфавитном порядке
 (с учетом регистра и на основе значений символов ASCII), а затем вернуть первое значение.

Возвращаемое значение должно быть строкой и иметь "***" между каждой из своих букв.

Вы не должны удалять или добавлять элементы из / в массив.
 */
public class SortAndStar {
    public static void main(String[] args) {
        String[] strings = {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"};
        String string = SortAndStar.twoSort(strings);
        System.out.println(string);
    }

    public static String twoSort(String[] s) {
        Optional<String> first = Arrays.stream(s)
                .sorted()
                .findFirst();
        String string = first.orElse("");
        String collect = IntStream.range(0, string.length())
                .mapToObj(i -> Character.toString(string.charAt(i)))
                .collect(Collectors.joining("***"));

        return collect;
    }
}
