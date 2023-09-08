package org.example.kyu_8;

/*
В этом простом задании вам дается число, и вы должны сделать его отрицательным. Но, может быть, число уже отрицательное?

Примеры
Kata.makeNegative(1);  // return -1
Kata.makeNegative(-5); // return -5
Kata.makeNegative(0);  // return 0
Примечания
Число уже может быть отрицательным, и в этом случае никаких изменений не требуется.
Ноль (0) не проверяется на наличие какого-либо определенного знака. Отрицательные нули не имеют математического смысла.
 */
public class ReturnNegative {

    public static int makeNegative(final int x) {

        return (x > 0) ? x * -1 : x; // Your code here.

    }
}
