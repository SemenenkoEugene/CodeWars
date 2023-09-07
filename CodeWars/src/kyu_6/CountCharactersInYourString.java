package kyu_6;

import java.util.HashMap;
import java.util.Map;

/*
Основная идея заключается в подсчете всех встречающихся символов в строке.
Если у вас есть строка, подобная aba, тогда результат должен быть {'a': 2, 'b': 1}.

Что, если строка пуста? Тогда результатом должен быть пустой объектный литерал, {}.
 */
public class CountCharactersInYourString {
    public static void main(String[] args) {
        System.out.println(count("aabb"));
    }

    public static Map<Character, Integer> count(String str) {
        // Happy coding!
        Map<Character, Integer> map = new HashMap<>();
        str = str.toLowerCase();
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
        }
        return map;
    }
}
