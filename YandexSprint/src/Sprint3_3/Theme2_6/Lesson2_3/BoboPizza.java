package Sprint3_3.Theme2_6.Lesson2_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoboPizza {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        new BoboPizza().loop();

    }

    private void loop() {
        List<BikeTimeCalculator> bikes = new ArrayList<BikeTimeCalculator>() {{
            add(new BikeTimeCalculator("Иван"));
            add(new BikeTimeCalculator("Василий"));
            add(new BikeTimeCalculator("Инга"));
        }};
        List<CarTimeCalculator> cars = new ArrayList<CarTimeCalculator>() {{
            add(new CarTimeCalculator("Ольга"));
            add(new CarTimeCalculator("Пётр"));
        }};
        List<HumanTimeCalculator> humans = new ArrayList<HumanTimeCalculator>() {{
            add(new HumanTimeCalculator("Анна"));
            add(new HumanTimeCalculator("Дмитрий"));
            add(new HumanTimeCalculator("Алексей"));
        }};
        CourierSelector selector = new CourierSelector(bikes, cars, humans);

        DeliveryInfo delivery = null;

        do {
            System.out.println("Введите расстояние в метрах => ");
            int distance = scanner.nextInt();
            delivery = selector.selectDelivery(distance);
            if (delivery != null) {
                System.out.println(
                        "Пицца будет доставлена через " + delivery.getTime() + " минут(у,ы)."
                );
                System.out.println("Ваш курьер - " + delivery.getName() + ".");
            } else {
                System.out.println("Доступных курьеров не найдено");
            }
        } while (delivery != null);
    }
}
