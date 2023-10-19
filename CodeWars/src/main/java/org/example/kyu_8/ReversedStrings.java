package org.example.kyu_8;
/*
Завершите решение так, чтобы оно обращало переданную в него строку вспять.

'world'  =>  'dlrow'
'word'   =>  'drow'
 */
public class ReversedStrings {
    public static void main(String[] args) {
        String string = "world";
        System.out.println(solution(string));
    }

    public static String solution(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder reverse = stringBuilder.reverse();
        return reverse.toString();
    }
}
