package org.example.kyu_7;

/*
Учитывая строку, указывающую диапазон букв, верните строку, которая включает все буквы в этом диапазоне,
включая последнюю букву. Обратите внимание, что если диапазон указан заглавными буквами, возвращайте строку также заглавными!

Примеры
"a-z" ➞ "abcdefghijklmnopqrstuvwxyz"
"h-o" ➞ "hijklmno"
"Q-Z" ➞ "QRSTUVWXYZ"
"J-J" ➞ "J"
Примечания
Дефис будет разделять две буквы в строке.
В этом случае вам не нужно беспокоиться об обработке ошибок (т. е. обе буквы будут иметь одинаковый регистр,
а вторая буква всегда будет стоять после первой в алфавитном порядке).
 */
public class GimmeTheLetters {
    public static void main(String[] args) {
        String s = "J-J";
        System.out.println(gimmeTheLetters(s));
    }

    public static String gimmeTheLetters(String s) {
        String[] words = s.split("-");
        char initialChar = words[0].charAt(0);
        char finalChar = words[1].charAt(0);
        StringBuilder result = new StringBuilder();
        for (char i = initialChar; i <= finalChar; i++) {
            result.append(i);
        }
        return result.toString();
    }
}
