package Sprint3_3.Theme3_6.Lesson6_10;

public class Automobile extends Transport{
    public Automobile() {
        wheelsNumber = 4;
    }

    protected String direction;

    public void turnTo(String worldSide) {
        direction = worldSide;
    }
}
