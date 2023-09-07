package Guskova.PointAndLine;

public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle(1,2,3.3);
        System.out.println(c2);

        Circle c3 = new Circle(new Point(4,5),6.6);
        System.out.println(c3);

        c1.setCenter(new Point(11,12));
        c1.setRadius(13.3);
        System.out.println(c1);


    }
}
