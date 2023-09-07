package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        List<String> list = Files.readAllLines(Path.of("src/main/resources/taxi_cars.txt"));

        Map<Integer, Point> pointMap = new HashMap<>();

        for (String s : list) {
            //id x y
            String[] strings = s.split(" ");
            int id = Integer.parseInt(strings[0]);
            int x = Integer.parseInt(strings[1]);
            int y = Integer.parseInt(strings[2]);
            pointMap.put(id, new Point(x, y));
        }

        int x1, x2, y1, y2;

        while (true) {

            System.out.println("Введите координаты поиска ");
            x1 = scanner.nextInt();
            y1 = scanner.nextInt();
            x2 = scanner.nextInt();
            y2 = scanner.nextInt();
            if (x1 < 0 || y1 < 0 || x2 < 0 || y2 < 0) {
                System.out.println("Вы ввели не корректные данные!");
                return;
            } else {
                break;
            }
        }

        int sum = 0;
        for (Map.Entry<Integer, Point> entry : pointMap.entrySet()) {
            if (entry.getValue().getX() > x1
                    && entry.getValue().getX() < x2
                    && entry.getValue().getY() > y2
                    && entry.getValue().getY() < y1) {
                System.out.println("Найдена машина с Id = " + entry.getKey());
                sum++;
            }
        }
        System.out.println("Всего найдено машин " + sum);
    }
}

