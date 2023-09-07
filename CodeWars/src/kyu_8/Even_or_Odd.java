package kyu_8;

/*
Создайте функцию,
 которая принимает целое число в качестве аргумента и возвращает "Even" для четных чисел или "Odd" для нечетных чисел.
 */
public class Even_or_Odd {
    public static void main(String[] args) {
        String s = Even_or_Odd.even_or_odd(1);
        System.out.println(s);
    }
    public static String even_or_odd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";

    }
}
