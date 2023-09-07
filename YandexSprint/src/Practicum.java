import java.util.ArrayList;
import java.util.List;

public class Practicum {

    public static void main(String[] args) throws InterruptedException {
        // метод Thread.currentThread()
        // возвращает текущий поток
        // в методе main() это поток main

        Square x = new Square();
        int a = 1;
        double b = 2;
        System.out.print(x.s(a, b + a) + x.s(a++, a));

    }
}

class Square {
    int s(int a, int b) {
        return a * b;
    }

    double s(double a, double b) {
        return a * b;
    }
}