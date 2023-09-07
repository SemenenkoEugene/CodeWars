package Sprint4_4.Theme2_5.Lesson1_5;

import java.util.List;

public class Forest {
    private List<MountainHare> hares;
    private static String season;
    // объявите недостающие переменные и добавьте конструктор

    public Forest(List<MountainHare> hares) {
        this.hares = hares;
    }

    public void setHares(List<MountainHare> hares) {
        this.hares = hares;
    }

    public static void setSeason(String newSeason) {
        if (newSeason.equals("зима")){
            MountainHare.setColor("белый");
        } else {
            MountainHare.setColor("серо-рыжий");
        }
    }

    // добавьте метод printHares()
    public void printHares(){
        for (MountainHare hare : hares){
            System.out.println(hare);
        }
    }
}
