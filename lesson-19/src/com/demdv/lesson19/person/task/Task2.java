package com.demdv.lesson19.person.task;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> integer = List.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        System.out.println(countUnique(integer));
    }

    private static int countUnique(List<Integer> list){
        Set<Integer> integers = new HashSet<>(list);
        return integers.size();
    }
}
