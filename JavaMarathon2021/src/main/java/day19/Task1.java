package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/main/resources/dushi.txt");
        Scanner scanner = new Scanner(file);

        scanner.useDelimiter("[.,:;()?!\"\\s–]+");

        Map<String, Integer> map = new TreeMap<>();
        int count = 1;

        while (scanner.hasNextLine()) {
            String word = scanner.next();
            map.merge(word, count, Integer::sum);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals("Чичиков")){
                System.out.println("Слово " + entry.getKey() + " встретилось в тексте " + entry.getValue() + " раз(а)");
            }
        }

    }
}
