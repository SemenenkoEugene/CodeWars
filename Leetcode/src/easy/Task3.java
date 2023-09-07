package easy;

import java.util.Scanner;

/*
Римские цифры представлены семью различными символами: I, V, X, L, C, D и M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

Например, 2 записывается как II римской цифрой, просто две единицы складываются вместе.
12 записывается как XII, что означает просто X + II. Число 27 записывается как XXVII, то есть XX + V + II.

Римские цифры обычно пишутся от наибольшего к наименьшему слева направо. Однако цифра, обозначающая четыре,
не является IIII. Вместо этого число четыре записывается как IV. Поскольку единица стоит перед пятеркой,
мы вычитаем ее, получая четыре. Тот же принцип применим и к числу девять, которое записывается как IX.
Существует шесть случаев, когда используется вычитание:

I можно поместить перед V (5) и X (10), чтобы получилось 4 и 9.
X можно поместить перед L (50) и C (100), чтобы получилось 40 и 90.
C можно поместить перед D (500) и M (1000), чтобы получилось 400 и 900.
Учитывая римскую цифру, преобразуйте ее в целое число.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(romanToInt(s));

    }

    public static int romanToInt(String s) {

        int answer = 0, prev = 0, number = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            if (number < prev) {
                answer = answer - number;
            } else {
                answer = answer + number;
            }
            prev = number;
        }
        return answer;
    }
}

