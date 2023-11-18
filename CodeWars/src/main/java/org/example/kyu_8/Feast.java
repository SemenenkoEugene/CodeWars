package org.example.kyu_8;

public class Feast {
    public static void main(String[] args) {
        System.out.println(feast("great blue heron","garlic nann"));
    }

    public static boolean feast(String beast, String dish) {
        char startIndexBeast = beast.charAt(0);
        char startIndexDish = dish.charAt(0);
        char endCharBeast = beast.charAt(beast.length() - 1);
        char endCharDish = dish.charAt(dish.length() - 1);
        return startIndexBeast == startIndexDish && endCharBeast == endCharDish;

    }
}
