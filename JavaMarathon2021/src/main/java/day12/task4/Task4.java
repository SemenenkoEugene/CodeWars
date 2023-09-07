package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> members1 = new ArrayList<>();
        members1.add("Петя");
        members1.add("Вася");
        members1.add("Коля");
        members1.add("Гриша");
        members1.add("Миша");

       MusicBand musicBand1 = new MusicBand("рокеры", 2010, members1);

       List<String> members2 = new ArrayList<>();
       members2.add("Оля");
       members2.add("Даша");
       members2.add("Катя");
       members2.add("Дуся");
       members2.add("Нюся");

       MusicBand musicBand2 = new MusicBand("хакеры", 2022, members2);

        System.out.println(musicBand1);
        System.out.println(musicBand2);

        System.out.println("Результат после слияния: ");

        MusicBand.transferMembers(musicBand1,musicBand2);
        System.out.println(musicBand1);
        System.out.println(musicBand2);

    }
}
