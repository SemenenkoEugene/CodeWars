package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.addAll(newList(0,30));
        list.addAll(newList(300,350));
        System.out.println(list);
    }

    public static List<Integer> newList(int from, int before) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = from; i < before; i++) {
            if (i % 2 == 0) {
                integerList.add(i);
            }
        }
        return integerList;
    }
}
