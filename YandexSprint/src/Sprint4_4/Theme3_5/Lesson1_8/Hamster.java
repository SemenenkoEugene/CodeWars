package Sprint4_4.Theme3_5.Lesson1_8;

public class Hamster extends Pet {

    private int pawsCount;

    protected Hamster(){
        super("Писк");
    }

    @Override
    public void giveVoice() {

    }

    public void hideFood() {
        System.out.println("Вся еда - в щечках!");
    }
}
