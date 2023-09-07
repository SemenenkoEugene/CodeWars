package day7;

/**
 * В классе Самолет реализовать статический метод compareAirplanes,
 * который в качестве аргументов принимает два объекта класса Airplane (два самолета)
 * и выводит сообщение в консоль о том, какой из самолетов длиннее.
 */
public class Airplane {

    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year +
                ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane2.length > airplane1.length) {
            System.out.println("Второй самолет длиннее");
        } else if (airplane1.length > airplane2.length) {
            System.out.println("Первый самолет длиннее");
        } else {
            System.out.println("Длины самолетов равны");
        }
    }

    public void fillUp(int n) {
        fuel += n;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }
}
