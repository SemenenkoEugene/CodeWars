package Sprint4_4.Theme2_5.Lesson1_5;

public class Counter {

    private int nonStaticVariable = 0;
    private static int staticVariable = 0;

    public void addTen() {
        nonStaticVariable += 10;
        staticVariable += 10;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        counter1.addTen();


        Counter counter2 = new Counter();

    }

}
