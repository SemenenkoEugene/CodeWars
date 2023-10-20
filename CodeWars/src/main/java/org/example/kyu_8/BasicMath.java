package org.example.kyu_8;

import java.util.Objects;

/*
Ваша задача - создать функцию, которая выполняет четыре основные математические операции.

Функция должна принимать три аргумента - operation (строка / символ), value1 (число), value2 (число).
Функция должна возвращать результат чисел после применения выбранной операции.

Примеры (оператор, значение1, значение2) --> вывод
('+', 4, 7) --> 11
('-', 15, 18) --> -3
('*', 5, 5) --> 25
('/', 49, 7) --> 7
 */
public class BasicMath {
    public static void main(String[] args) {
        System.out.println(basicMath("/",4,7));
    }

    public static Integer basicMath(String op, int v1, int v2) {
        if (Objects.equals(op, "+")) {
            return v1 + v2;
        } else if (Objects.equals(op, "-")) {
            return v1 - v2;
        } else if (Objects.equals(op, "*")) {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }
}
