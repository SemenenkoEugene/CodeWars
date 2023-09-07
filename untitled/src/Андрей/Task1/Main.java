package Андрей.Task1;

/*
Создайте список произвольных слов.
 С помощью StreamAPI и метода reduce объедините слова в предложение.
  Выведите первоначальный список и полученное предложение в консоль.
 */

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Создайте", "список", "произвольных", "слов", "и",
                "объедините", "слова", "в", "предложение");

        String sentence = words.stream()
                .reduce("", (partialSentence, word) -> partialSentence + " " + word);

        System.out.println("Список слов: " + words);
        System.out.println("Полученное предложение: " + sentence);
    }
}
