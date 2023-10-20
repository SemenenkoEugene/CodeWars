package org.example.kyu_8;

/*
Завершите метод, который принимает логическое значение и возвращает "Yes" строку для true или "No" строку для false.
 */
public class BoolToWord {

    public static String boolToWord(boolean b) {
        if (b) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
