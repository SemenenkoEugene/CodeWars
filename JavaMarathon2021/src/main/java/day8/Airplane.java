package day8;

/**
 * Помимо этого, в классе необходимо реализовать метод info(), который выводит сообщение в следующем формате:
 * * “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”
 * *
 * * Также, необходимо реализовать метод fillUp(int n), который в качестве аргумента принимает число
 * * и дозаправляет топливный бак самолета на это значение.
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

    @Override
    public String toString() {
        return "Изготовитель: " + manufacturer +
                ", год выпуска: " + year +
                ", длина: " + length +
                ", вес: " + weight +
                ", количество топлива в баке: " + fuel;
    }
}
