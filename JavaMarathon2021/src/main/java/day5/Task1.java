package day5;

/**
 * Задачи:
 * <p>
 * 1. Создать класс Автомобиль (англ. Car) с полями “Модель”, “Цвет”, “Год выпуска”.
 * Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
 * Задать значение для каждого поля, используя set методы.
 * Вывести в консоль значение каждого из полей, используя get методы.
 * Созданный вами класс должен отвечать принципам инкапсуляции.
 */
public class Task1 {
    public static void main(String[] args) {
        Car car = new Car("Opel", "white", 2011);
        System.out.println("Наш авто: " + car.getModel() + " " + car.getColor() + " " + car.getYear());
    }
}