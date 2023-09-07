package Sprint4_4.Theme3_5.Lesson2_8;

public class Rhombus extends Parallelogram {
    // Длина стороны ромба
    private final double a;
    // Высота ромба
    private final double h;

    public Rhombus(double a, double h) {
        super(a, h);
        this.a = a;
        this.h = h;
    }

    public double getArea() {
        return a * h;
    }
}
