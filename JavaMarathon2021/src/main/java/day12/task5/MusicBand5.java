package day12.task5;

import java.util.List;

public class MusicBand5 {

    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand5(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static void transferMembers(MusicBand5 fromBand, MusicBand5 toBand) {
        for (MusicArtist members : fromBand.getMembers()) {
            toBand.getMembers().add(members);
        }
        fromBand.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(this.members);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "MusicBand5{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }
}
