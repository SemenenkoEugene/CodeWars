package Sprint5_5.Theme3_5.Lesson7_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PotatoLaboratory {
    public static void main(String[] args) {
        List<Potato> potatoes = List.of(
                new Potato(1, 30, 30, 30),
                new Potato(2, 35, 31, 35),
                new Potato(3, 40, 35, 44),
                new Potato(4, 28, 44, 41),
                new Potato(5, 33, 23, 30),
                new Potato(6, 35, 33, 33),
                new Potato(7, 38, 41, 24)
        );

        List<Potato> fourUnderExperiment = findPotatoesForExperiment(potatoes);

        System.out.println("Картофелины для эксперимента: " + fourUnderExperiment);
    }

    private static List<Potato> findPotatoesForExperiment(List<Potato> potatoes) {
				/* Вычислите две самые большие и две самые маленькие картофелины,
           а затем выведите их в порядке от самых маленьких до самых больших.*/
        var potatoArrayList = new ArrayList<>(potatoes);
        Collections.sort(potatoArrayList);
        var potato = potatoArrayList.get(0);
        var potato1 = potatoArrayList.get(1);
        var potato2 = potatoArrayList.get(5);
        var potato3 = potatoArrayList.get(6);

        return List.of(potato, potato1, potato2, potato3);
    }
}
