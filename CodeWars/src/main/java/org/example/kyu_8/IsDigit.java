package org.example.kyu_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Учитывая строку s, напишите метод (функцию), который вернет true,
если это допустимое одиночное целое число или плавающее число, или false, если это не так.

Допустимые примеры, должны возвращать true:

isDigit("3")
isDigit("  3  ")
isDigit("-3.23")
должно возвращать false:

isDigit("3-4")
isDigit("  3   5")
isDigit("3 5")
isDigit("zero")
 */
public class IsDigit {
    public static void main(String[] args) {
        IsDigit digit = new IsDigit();
        System.out.println(digit.isDigit( "s2324"));

    }
    public boolean isDigit(String s) {
        String regex = "\\s*-?\\d+(:?\\.\\d+)?\\s*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
