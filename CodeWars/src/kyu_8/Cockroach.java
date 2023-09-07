package kyu_8;

/*
Таракан - одно из самых быстрых насекомых. Напишите функцию, которая измеряет его скорость в километрах в час
и возвращает ее в сантиметрах в секунду, округленную в меньшую сторону до целого числа (= этаж).

Например:

1.08 --> 30
Внимание! Вводимое значение представляет собой действительное число (фактический тип зависит от языка) и равно >= 0.
 Результатом должно быть целое число.
 */
public class Cockroach {
    public static void main(String[] args) {
        Cockroach cockroach = new Cockroach();
        int i = cockroach.cockroachSpeed(1.08);
        System.out.println(i);
    }
    public int cockroachSpeed(double x) {
        return (int) (x * 27.7778);
    }
}
