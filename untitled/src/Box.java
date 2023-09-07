public class Box {
    double weight;
    double height;
    double depth;

    public Box(double weight, double height, double depth) {
        this.weight = weight;
        this.height = height;
        this.depth = depth;
    }

    public String toString() {
        return "Размеры " + weight + " на " + depth + " на " + height + ".";
    }
}

class toStringDemo {
    public static void main(String[] args) {
        Box b = new Box(10,12,14);
        String s = "Объект b типа Box: " + b;
        System.out.println(b);
        System.out.println(s);
    }
}
