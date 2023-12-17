package org.example.kyu_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
ПОМОГИТЕ! Джейсон не может найти свой учебник! До даты тестирования осталось два дня,
а все учебники Джейсона вышли из строя! Помогите ему отсортировать список (ArrayList в java) учебников по предметам,
чтобы он мог подготовиться к тестированию.

Сортировка НЕ должна учитывать регистр
 */
public class Sort {
    public static void main(String[] args) {
        List<String> textbooks = new ArrayList<>();
        textbooks.add("Math");
        textbooks.add("history");
        textbooks.add("Science");
        textbooks.add("math");
        textbooks.add("Biology");

        List<String> sortedTextbooks = sort(textbooks);
        for (String textbook : sortedTextbooks) {
            System.out.println(textbook);
        }
    }

    public static List<String> sort(List<String> textbooks) {
        textbooks.sort(String.CASE_INSENSITIVE_ORDER);
        return textbooks;
    }
}
