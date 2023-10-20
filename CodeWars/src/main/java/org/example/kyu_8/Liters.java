package org.example.kyu_8;

/*
Натан любит кататься на велосипеде.

Поскольку Натан знает, как важно поддерживать уровень гидратации, он выпивает 0,5 литра воды за час езды на велосипеде.

Вам задается время в часах, и вам нужно вернуть количество литров, которое выпьет Натан, округленное до наименьшего значения.

Например:

time = 3 ----> litres = 1

time = 6.7---> litres = 3

time = 11.8--> litres = 5
 */
public class Liters {
    public static void main(String[] args) {
        System.out.println(Liters(11.8));
    }

    public static int Liters(double time) {
        return (int) ((int) time * 0.5);

    }
}
