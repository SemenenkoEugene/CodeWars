package day2;

import java.util.Objects;
import java.util.Scanner;

/**
 * 1. Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner,
 * число, соответствующее количеству этажей в здании. Используя условный оператор if, необходимо
 * вывести в консоль сообщение о типе такого дома.
 * <p>
 * Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более - “Многоэтажный дом”.
 * Также, необходимо учесть что может быть введено отрицательное значение, в таком случае сообщить “Ошибка ввода”.
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value <= 0) {
            System.out.println("Ошибка ввода");
        }
        if (value > 0 && value < 5) {
            System.out.println("Малоэтажный дом");
        } else if (value >= 5 && value < 9) {
            System.out.println("Среднеэтажный дом");
        } else if (value >= 9) {
            System.out.println("Многоэтажный дом");
        }
    }
}
