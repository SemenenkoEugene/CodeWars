package org.example.kyu_8;

/*
Можете ли вы найти иголку в стоге сена?

Напишите функцию, findNeedle() которая принимает array полный мусор, но содержит один "needle"

После того, как ваша функция найдет иголку, она должна вернуть сообщение (в виде строки), в котором говорится:

"found the needle at position " плюс index оно нашло иголку, так что:

Пример (Ввод -> Вывод)

["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found
 */
public class FindNeedle {
    public static void main(String[] args) {
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        System.out.println(findNeedle(haystack1));
    }

    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == null) {
                continue;
            }
            if (haystack[i].equals("needle")) {
                return "found the needle at position " + i;
            }
        }
        return "";
    }
}
