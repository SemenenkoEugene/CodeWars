package Sprint4_4.Theme3_5.Lesson1_8;

public abstract class Pet {

    protected String voice;

    protected Pet(String voice) {
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void sleep(){
        System.out.println("Сплю");
    }

    public void play(){
        System.out.println("Играю");
    }

    public abstract void giveVoice();
}
