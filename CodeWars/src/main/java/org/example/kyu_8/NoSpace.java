package org.example.kyu_8;

/*
Напишите функцию, которая удаляет пробелы из строки, а затем возвращает результирующую строку.

Примеры:

Input -> Output
"8 j 8   mBliB8g  imjB8B8  jl  B" -> "8j8mBliB8gimjB8B8jlB"
"8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd" -> "88Bifk8hB8BB8BBBB888chl8BhBfd"
"8aaaaa dddd r     " -> "8aaaaaddddr"
 */
public class NoSpace {
    public static void main(String[] args) {
        String string = "8 j 8   mBliB8g  imjB8B8  jl  B";
        System.out.println(noSpace(string));
    }

    public static String noSpace(final String x) {
        StringBuilder builder = new StringBuilder();
        String[] strings = x.split(" ");
        for (String string : strings) {
            builder.append(string);
        }
        return builder.toString();
    }
}
