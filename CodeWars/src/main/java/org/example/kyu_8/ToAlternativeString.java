package org.example.kyu_8;

/*
Определите String.prototype.toAlternatingCase (или аналогичную функцию / метод, например, to_alternating_case/toAlternatingCase/ToAlternatingCase на выбранном вами языке; подробности в исходном решении) таким образом, чтобы каждая строчная буква становилась прописной, а каждая заглавная буква - строчной. Например:

StringUtils.toAlternativeString("hello world") == "HELLO WORLD"
StringUtils.toAlternativeString("HELLO WORLD") == "hello world"
StringUtils.toAlternativeString("hello WORLD") == "HELLO world"
StringUtils.toAlternativeString("HeLLo WoRLD") == "hEllO wOrld"
StringUtils.toAlternativeString("12345") == "12345" // Non-alphabetical characters are unaffected
StringUtils.toAlternativeString("1a2b3c4d5e") == "1A2B3C4D5E"
StringUtils.toAlternativeString("StringUtils.toAlternatingCase") == "sTRINGuTILS.TOaLTERNATINGcASE"
Как обычно, ваша функция / метод должны быть чистыми, т.е. они не должны изменять исходную строку.
 */
public class ToAlternativeString {
    public static void main(String[] args) {
        System.out.println(toAlternativeString("StringUtils.toAlternatingCase"));
    }

    public static String toAlternativeString(String string) {
        StringBuilder sb = new StringBuilder();

        char[] stringCharArray = string.toCharArray();
        for (char charString : stringCharArray) {
            String charStringResult = String.valueOf(charString);
            if (charStringResult.equals(charStringResult.toLowerCase())) {
                String stringResultUpperCase = charStringResult.toUpperCase();
                sb.append(stringResultUpperCase);
            } else {
                String stringResultLowerCase = charStringResult.toLowerCase();
                sb.append(stringResultLowerCase);
            }
        }

        return sb.toString();
    }
}
