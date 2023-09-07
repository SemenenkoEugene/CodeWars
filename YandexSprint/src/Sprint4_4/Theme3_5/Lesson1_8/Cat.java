package Sprint4_4.Theme3_5.Lesson1_8;

public class Cat extends Pet {

    private int pawsCount;

    protected Cat() {
        super("Мяу");
    }


    public void catchMouse() {
        System.out.println("Поймала мышку!");
    }

    @Override
    public void giveVoice() {
        System.out.println("Мяу");
    }
}
