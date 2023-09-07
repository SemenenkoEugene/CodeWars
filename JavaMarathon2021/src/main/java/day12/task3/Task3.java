package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(new MusicBand("Петя", 2001));
        musicBands.add(new MusicBand("Вася", 1998));
        musicBands.add(new MusicBand("Катя", 2010));
        musicBands.add(new MusicBand("Моня", 1994));
        musicBands.add(new MusicBand("Лось", 1954));
        musicBands.add(new MusicBand("Конь", 2015));
        musicBands.add(new MusicBand("Пень", 2022));
        musicBands.add(new MusicBand("Леня", 2000));
        musicBands.add(new MusicBand("Фекла", 2008));
        musicBands.add(new MusicBand("Петя", 2005));

        System.out.println(musicBands);

        List<MusicBand> musicBandList = groupsAfter2000(musicBands);
        System.out.println(musicBandList);


    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {

        List<MusicBand> musicBandList = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear()>2000){
                musicBandList.add(band);
            }
        }
        return musicBandList;
    }
}
