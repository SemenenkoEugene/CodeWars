package kyu_8;
/*
Это довольно просто. Ваша цель - создать функцию, которая удаляет первый и последний символы строки.
Вам предоставляется один параметр - исходная строка. Вам не нужно беспокоиться о строках, содержащих менее двух символов.
 */
public class Remove_First_and_Last_Character {

    public static void main(String[] args) {
        String s = Remove_First_and_Last_Character.remove("eloquent");
        System.out.println(s);
    }
    public static String remove(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.deleteCharAt(0);
        stringBuilder.reverse();
        stringBuilder.deleteCharAt(0);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
