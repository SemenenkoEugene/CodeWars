package org.example.kyu_8;

/*
Учитывая строку, вы должны вернуть строку, в которой каждый символ (с учетом регистра) повторяется один раз.

Примеры (Ввод -> Вывод):
* "String"      -> "SSttrriinngg"
* "Hello World" -> "HHeelllloo  WWoorrlldd"
* "1234!_ "     -> "11223344!!__  "
Удачи!
 */
public class Double_Char {

    public static void main(String[] args) {
        String s = "String";
        String string = Double_Char.doubleChar(s);
        System.out.println(string);
    }

    public static String doubleChar(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sb.append(ch).append(ch);
        }
        return sb.toString();
    }
}
